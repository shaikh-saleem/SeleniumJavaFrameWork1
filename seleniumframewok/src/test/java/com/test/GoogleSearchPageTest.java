package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GooglePageObject_Search;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		searchTest();
	}
	public static void searchTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 GooglePageObject_Search searchObj = new GooglePageObject_Search(driver);
		 driver.get("https://www.google.com/");
		 
		 searchObj.setTextInSerachBox("A B C D");
		 Thread.sleep(3000);
		 searchObj.clickSearchButton();
		 Thread.sleep(3000);
		 driver.close();
		 System.out.println("Tested Successfully..");
	}
}
