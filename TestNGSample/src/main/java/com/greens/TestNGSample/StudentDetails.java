package com.greens.TestNGSample;

import org.testng.annotations.Test;

public class StudentDetails {

	@Test()
	public void studentName() {
		
		System.out.println("studentName "+Thread.currentThread().getId());

	}
	
	@Test()
	public void studentID() {
		
		System.out.println("studentID "+Thread.currentThread().getId());

	}


}
