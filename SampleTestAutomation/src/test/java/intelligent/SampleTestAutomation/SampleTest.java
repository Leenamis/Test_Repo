package intelligent.SampleTestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {
	
	//Declaration of class variable.
	WebDriver driver;
	
	
	//This method will run before every method, test, method
	@BeforeSuite
	public void beforeSuite()
	{

		//System.setProperty("webdriver.chrome.driver", "/Users/leenamishra/Downloads/chromedriver");
		
		//this.driver = new ChromeDriver();
		
		//this.driver = new SafariDriver();
		
		System.setProperty("webdriver.gecko.driver", "/Users/leenamishra/Downloads/geckodriver");
		
		this.driver = new FirefoxDriver();
		
		
	}
	
	@Test(priority=1)
	public void launchBrowser()
	{
		
		driver.get("https://www.telehealth.com/");
		
		System.out.println(driver.getTitle());
		
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}
	
	

}
	