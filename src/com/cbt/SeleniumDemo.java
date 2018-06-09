package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
	// set system properties
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Yaroslav Kryvda\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");	
	//create driver object
	
	//webdriver = class that used to control a browser
	WebDriver driver = new ChromeDriver();
	//driver.get("http://google.com");
	/**
	 * 1.Open Browser
	 * 2.go to http://google.com
	 * 3.Verify title
	 */
//	driver.get("http://google.com");
//	String expected = "Google";
//	String actual =driver.getTitle();
//	
//	System.out.println(actual);
//	
//	if(expected.equals(actual)) {
//		System.out.println("We are on the Right page - PASS");
//		
//	}else {
//		System.out.println("Nope you are not there- FAIL");
//		System.out.println("Expected title:"+expected);
//		System.out.println("Actual:"+ actual);
//	}
//	// closes driver
//	driver.close();
	
	/**
	 * Test case2: Cybertek url Verification
	 * 1.Open Browser
	 * 2.go to /www.etsy.com/
	 * 3.Verify title contains
	 * Expected:https:etsy
	 */
//	//navigate().t()=driver.get() -- IT IS SAME AS
//	driver.navigate().to("https://www.etsy.com/");
//	
//	String expected= "etsyssss";
//	
//	String actual = driver.getCurrentUrl();
//	System.out.println(actual);
//	
//	if(actual.contains(expected)) {
//		System.out.println("PASS");
//	}else {
//		System.out.println("FAIl");
//		System.out.println("Expected url:"+ expected);
//		System.out.println("Actual:"+ actual);
//	}
	/**
	 * Test case2: Back and forth navigation
	 * 1.Open Browser chrome
	 * 2.go to http://google.com
	 * 3.click on Gmail link
	 * 4.Verify title contains
	 * Expected: Gmail
	 * 5.Go back to google by using the back button
	 * 6.Verify title contains:
	 * Expected: Google
	 * 7. Go back to gmail using Forward button
	 * 8.Verify title contains
	 * Expected:Gmail
	 */
	
	driver.get("http://google.com");
	
	driver.findElement(By.linkText("Gmail")).click();
	
	String expected = "Gmail";
	String actual =driver.getTitle();
	
	System.out.println(actual);
	
	if(actual.contains(expected)) {
		System.out.println("We are on the Right page - PASS");
		
	}else {
		System.out.println("Nope you are not there- FAIL");
		System.out.println("Expected title:"+expected);
		System.out.println("Actual:"+ actual);
	}
	//goes back to previous page;
	driver.navigate().back();
	
	 expected = "Google";
	 actual =driver.getTitle();
	
	System.out.println(actual);
	
	if(actual.contains(expected)) {
		System.out.println("We are on the Right page - PASS");
		
	}else {
		System.out.println("Nope you are not there- FAIL");
		System.out.println("Expected title:"+expected);
		System.out.println("Actual:"+ actual);
	}
	
	driver.navigate().forward();
	
	 expected = "Gmail";
	 actual =driver.getTitle();
	
	System.out.println(actual);
	
	if(actual.contains(expected)) {
		System.out.println("We are on the Right page - PASS");
		
	}else {
		System.out.println("Nope you are not there- FAIL");
		System.out.println("Expected title:"+expected);
		System.out.println("Actual:"+ actual);
	}
	
	
	driver.close();
}
}
