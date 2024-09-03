package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.Basetest;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class TC_001_login_Functionality extends Basetest
{
	@Test(groups={"sanity","master"})
	public void Test_Loginfuncationality() throws InterruptedException
	{
try {

		LoginPage lp= new LoginPage(driver);
		logger.info("******started test case**********");
		lp.click_on_myaccountbtn();
		lp.click_on_login_BTN();
		lp.setusername(p.getProperty("email"));
		lp.setpassword((p.getProperty("password")));
		lp.click_on_Submit();
		
	
		HomePage hp= new HomePage(driver);
		boolean home=hp.verify_homepage();
		AssertJUnit.assertTrue(home);
		logger.info("******ended test case**********");
	}
catch (Exception e)
{
	logger.info("******exception occured **********");
	AssertJUnit.fail();
}
	}
}
