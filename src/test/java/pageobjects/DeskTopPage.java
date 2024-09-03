package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeskTopPage extends BasePage
{
	public DeskTopPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"content\"]/h2")
	WebElement name_pc;

    



//actions
    public boolean verify_pc_name()
    {
    	try
    	{
    		return(name_pc.isDisplayed());
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    }
    




}
