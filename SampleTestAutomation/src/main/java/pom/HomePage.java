package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//h1[contains(.,'The Best Telehealth Services')]")
	WebElement homepageh1;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 15);
		
		PageFactory.initElements(driver, this);

		
	}
	
	public void verifyHomepageHeader()
	{
		System.out.println("Home page header verified.");
		
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(homepageh1));
	}

}
