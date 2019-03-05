package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserDemo {

	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Browser Name is:"+browserName);
		System.out.println("Thread count is:"+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","E:\\Selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test completed");
	}
}
