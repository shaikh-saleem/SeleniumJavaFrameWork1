package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {
	static WebDriver driver;
	
	public static void test() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		//click on choose file buton
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		
		Runtime.getRuntime().exec("E:\\Selenium\\FileUploadScript.exe");
		Thread.sleep(4000);
		System.out.println("test success..");
		//driver.close();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		test();

	}

}
