package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class ExtendReportBasicDemo {
	static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		// initialize ExtentXReporter (deprecated)
		ExtentHtmlReporter extentxReporter = new ExtentHtmlReporter("extentsreport.html");
		
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(extentxReporter);
		
		//create test
		ExtentTest test = extent.createTest("Google testsearch");
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		 test.log(Status.INFO, "Starting test case");
		//goto google
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("enter in search textbox");
		Thread.sleep(3000);
		//click on search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("click on search button");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		test.pass("close the driver");
		test.info("Test completed..");
		extent.flush();
	}

}
