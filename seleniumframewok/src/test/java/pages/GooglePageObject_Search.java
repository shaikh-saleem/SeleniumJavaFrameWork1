package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePageObject_Search {
	static WebDriver driver=null;
		//declare all the objects
		By textbox_Search = By.name("q");
		By button_Search = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']");
		
		public GooglePageObject_Search(WebDriver driver)
		{
			this.driver=driver;
		}
		//Action on those objects
		public void setTextInSerachBox(String text)
		{
			driver.findElement(textbox_Search).sendKeys(text);
		}
		public void clickSearchButton()
		{
			driver.findElement(button_Search).sendKeys(Keys.RETURN);
		}
}
