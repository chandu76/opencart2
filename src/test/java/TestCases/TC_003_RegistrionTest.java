package TestCases;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestBase.Basetest;
import Utilities.Registration_Page_Data;
import pageobjects.RegisterPage;

public class TC_003_RegistrionTest extends Basetest 
{
	@Test(dataProvider="registion_data", dataProviderClass=Registration_Page_Data.class,groups={"regression","DataDriven"})
	public void Test_Registrion_Funcationality(String fname, String lname, String ph_no, String pwd, String cnf_pwd, String res)
	{
		try {
			RegisterPage rp=new RegisterPage(driver);
			rp.click_on_my_Account_Btn();
			rp.click_on_registrtion_page();
			rp.Set_firstName(fname);
			rp.set_lastname(lname);
			rp.set_email(randomsting().toLowerCase()+"@gmail.com");
			rp.set_telephone_number(ph_no);
			rp.set_password(pwd);
			rp.set_cnf_password(cnf_pwd);
			
			
			Assert.assertEquals(pwd, cnf_pwd);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
