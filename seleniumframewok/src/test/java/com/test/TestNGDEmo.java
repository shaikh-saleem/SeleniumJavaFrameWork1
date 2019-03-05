package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.GoogleSearchPage;

public class TestNGDEmo {
	static WebDriver driver=null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest() throws IOException
	{
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		}
		
	
	@Test
	public static void googleSearch() throws InterruptedException
	{
		//goto google
		driver.get("https://www.google.com/");
		//enter search textbox
		GoogleSearchPage.textbox_Search(driver).sendKeys("Automation step by step");
		Thread.sleep(5000);
		//click on search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		
		
	}
	@AfterTest
	public void tearDownTest()
	{
	driver.close();
	//driver.quit();
	System.out.println("Test successfully completed");
	PropertiesFile.writeToProperties();
	}
}
