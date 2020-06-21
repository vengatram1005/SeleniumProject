package com.test.Sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int c = 0;
	int retryCount = 3;

	public boolean retry(ITestResult result) {

		if (c < retryCount) {
			c++;
			return true;
		}
		return false;
	}

}
