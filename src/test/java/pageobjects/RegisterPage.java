package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement myaccountbtn;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement registerpage;

	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement firstname;

	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement lastname;

	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;

	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement telephone;

	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement confirm_password;

	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	WebElement subscribe_rdo_btn_Yes;

	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
	WebElement subscribe_rdo_btn_No;

	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement privacy_policy_chk_btn;

	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continuebtn;



	//Actions

	public void click_on_my_Account_Btn()
	{
		myaccountbtn.click();
	}
	public void click_on_registrtion_page()
	{
		registerpage.click();
	}
	public void Set_firstName(String fname)
	{
		firstname.clear();
		firstname.sendKeys(fname);
	}
	public void set_lastname(String lname)
	{
		lastname.clear();
		lastname.sendKeys(lname);
	}
	public void set_email(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	public void set_telephone_number(String num)
	{
		telephone.clear();
		telephone.sendKeys(num);
	}
	public void set_password(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void set_cnf_password(String cnfpwd)
	{
		confirm_password.clear();
		confirm_password.sendKeys(cnfpwd);

	}
	public void click_on_subscribe_rdo_btn_Yes()
	{
		subscribe_rdo_btn_Yes.click();
	}
	public void click_on_subscribe_rdo_btn_No()
	{
		subscribe_rdo_btn_No.click();
	}
	public void click_on_privacy_policy_chk_btn()
	{
		privacy_policy_chk_btn.click();
	}
	public void click_on_continuebtn()
	{
		continuebtn.click();
	}

}
