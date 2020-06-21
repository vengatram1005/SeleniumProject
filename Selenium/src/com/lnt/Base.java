package com.lnt;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static void initializeBrowser(String browser) {
		try {

			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"E:\\Venkat\\Workspace\\Selenium_Batch\\Selenium\\Driver\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver",
						"E:\\Venkat\\Workspace\\Selenium_Batch\\Selenium\\Driver\\chromedriver.exe");

				driver = new FirefoxDriver();

			} else {

				System.setProperty("webdriver.ie.driver",
						"E:\\Venkat\\Workspace\\Selenium_Batch\\Selenium\\Driver\\chromedriver.exe");

				WebDriver driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();

		} catch (Exception e) {

			System.out.println("Unable to lauch browser");

		}

	}

	public static void launchApp(String url) {
		try {

			driver.get(url);

		} catch (Exception e) {

			System.out.println("Unable to launch the application");
		}

	}

	public static void enterText(WebElement element, String name) {

		try {
			element.sendKeys(name);

		} catch (Exception e) {

			System.out.println("unable to enter value in textbox");

		}

	}

	public static void clickButton(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {

			System.out.println("Unable to click the button");
		}

	}

	public static void screenShot(String name) {

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File f = ts.getScreenshotAs(OutputType.FILE);

			File f1 = new File(System.getProperty("user.dir") + "/Result/" + name + ".png");

			FileUtils.copyFile(f, f1);

		} catch (Exception e) {

			System.out.println("Unable to take screenshot");
		}

	}
	
	public static void dropdown(WebElement element, String option, String value) {
		
		try {
			
			Select s=new Select(element);
			
			if(option.equalsIgnoreCase("index")) {
				
				int index = Integer.parseInt(value);
				
				s.selectByIndex(index);
				
				
			}else if (option.equalsIgnoreCase("value")) {
				
				s.selectByValue(value);
				
			}else {
				
				s.selectByVisibleText(value);
			}
			
			
			
		} catch (Exception e) {
			
			
		}

	}

}
