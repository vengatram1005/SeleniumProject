package com.greens;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class Test {
	
	@BeforeClass
	public static void beforeClass() {

		System.out.println("Before Class");
	}
	@Before
	public void before() {

		System.out.println("Before");
	}
	
	@org.junit.Test
	public void test() {
		
		String s="Java";
		Assert.assertFalse(s.isEmpty());

		System.out.println("Test");
	}
	
	@Ignore
	@org.junit.Test
	public void test1() {

		System.out.println("Test1");
	}
	
	@After
	public void after() {

		System.out.println("After");
	}
	@AfterClass
	public static void afterClass() {

		System.out.println("After Class");
	}
	
	

}
