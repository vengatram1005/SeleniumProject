package com.greens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Venkat\\Workspace\\Selenium_Batch\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement x = driver.findElement(By.partialLinkText("Gmai"));
		
		x.click();
		
		
		
		
		
		
		}
		 
	
		
		
		
		
		
		
		
		

		 

}
