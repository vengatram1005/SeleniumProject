package com.greens.TestNGSample;

import org.testng.annotations.Test;

public class Sample {
	
	@Test()
	public void EmployeeName() {
		
		System.out.println("EmployeeName "+Thread.currentThread().getId());

	}

}
