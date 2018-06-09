package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryDemo {
	public static void main(String[] args) {
		/**
		 * Test case: Basic Authentication test
		 * 1.Open Browser chrome
		 * 2.go to http://newtours.demoaunt.com
		 * 3.enter username:Yaroslav
		 * 4.enter pass:17151993
		 * 5.click Sign in button
		 * 5.Verify title contains
		 * Expected: Find a Flight
		 */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaroslav Kryvda\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//sendKeys - types text to input
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("Yaroslav");
		driver.findElement(By.name("password")).sendKeys("17151993");
		driver.findElement(By.name("login")).click();
		
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(actual.contains(expected)) {
			System.out.println("Pass we are on the right page:"+actual);
		}else {
			System.out.println("FAIL wrong PAGE");
			System.out.println("Expected title:"+ expected);
			System.out.println("DOESNT MATCH actual:"+ actual);
		}
		
		driver.close();
	}
}
