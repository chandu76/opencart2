package TestCases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestBase.Basetest;
import Utilities.Dataprovider;
import pageobjects.DeskTopPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class TC_002_Login_DDT extends Basetest
{
	
	
	@Test(dataProvider ="Login_Data", dataProviderClass=Dataprovider.class, groups={"DataDriven","master"})
	public void Login_with_DDT(String email, String pwd, String expRes) throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		try{
			lp.click_on_myaccountbtn();
			lp.click_on_login_BTN();
			lp.setusername(email);
			lp.setpassword(pwd);
			lp.click_on_Submit();
			
			HomePage hp= new HomePage(driver);
			boolean home=hp.verify_homepage();
			if(expRes.equalsIgnoreCase("valid"))
			{
				if(home==true) 
				{
					hp.ClickOnLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			else if(expRes.equalsIgnoreCase("invalid")) 
			{
				if(home==true) 
				{
					hp.ClickOnLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}

			}
		}

		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(groups={"master","sanity"})
	public void desktop_beforelogin_functionality()
	{
		LoginPage lp= new LoginPage(driver);
		DeskTopPage dp=new DeskTopPage(driver);
		lp.mouseover_on_desktop_clickon_pc();
		boolean res=dp.verify_pc_name();
		logger.info("verifying pc name");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(true);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
