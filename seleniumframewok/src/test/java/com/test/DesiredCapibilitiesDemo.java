package com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.GoogleSearchPage;

public class DesiredCapibilitiesDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreprotectedmodesettings", true);
		
		System.setProperty("webdriver.ie.driver","E:\\Selenium\\IEDriverServer.exe");
		driver=new InternetExplorerDriver(caps);
		driver.get("http://google.com");
		
		//enter search textbox
				GoogleSearchPage.textbox_Search(driver).sendKeys("Automation step by step");
				Thread.sleep(5000);
				//click on search button
				//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
				GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
				
				driver.quit();
				driver.close();
				System.out.println("tested");
	}

}
