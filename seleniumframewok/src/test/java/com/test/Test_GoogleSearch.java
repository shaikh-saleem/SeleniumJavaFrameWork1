package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	public static void googleSearch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//goto google
		driver.get("https://www.google.com/");
		//enter search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		//click on search button
		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
	}
}
