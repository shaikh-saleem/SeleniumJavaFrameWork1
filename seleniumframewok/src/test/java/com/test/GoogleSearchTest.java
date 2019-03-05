package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	public static void googleSearch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		//goto google
		driver.get("https://www.google.com/");
		//enter search textbox
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_Search(driver).sendKeys("Automation step by step");
		Thread.sleep(5000);
		//click on search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.close();
		System.out.println("Test successfully completed");
	}
}
