package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.Basetest;

public class HomePage extends BasePage{

	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
	WebElement logout;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/h2[1]")
	WebElement message;
	
	
	
	
	
	//Actions
	
	
	
	public boolean verify_homepage()
	{
		try{
			return (message.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public void ClickOnLogout()
	{
		logout.click();
	}
}