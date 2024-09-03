package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut_Page extends BasePage {
	public LogOut_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement Account_logout;


	//actions

	public boolean verify_logout()
	{
		try{
			return (Account_logout.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}

}
