package seleniumframewok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//String pathlocation=System.getProperty("user.dir");
		//mozila
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
		// driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver","E:\\Selenium\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://seleniumhq.org");
		
		Thread.sleep(4000);
		driver.close();
	}

}
