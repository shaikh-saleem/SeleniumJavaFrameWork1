package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo_TestNG {
	ExtentHtmlReporter extentxReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		// initialize ExtentXReporter (deprecated)
		extentxReporter = new ExtentHtmlReporter("extentsreportNG.html");

		// initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
		extent.attachReporter(extentxReporter);

	}
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test1() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Google testsearch");
		//goto google
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");

		test.log(Status.INFO, "Starting test case");



		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("enter in search textbox");
		Thread.sleep(3000);
		//click on search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("click on search button");
		//test.addScreenCaptureFromPath(imagePath);
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Google testsearch");
		//goto google
		//driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");

		test.log(Status.INFO, "Starting test case");



		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("enter in search textbox");
		//Thread.sleep(3000);
		//click on search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("click on search button");
		//test.addScreenCaptureFromPath(imagePath);
	}
	@AfterTest
	public void tearDown()
	{driver.close();
	driver.quit();
	//test1.pass("close the driver");
	//test1.info("Test completed..");
	
	
	

	}
	@AfterSuite
	public void tear()
	{extent.flush();
		
	}

}
