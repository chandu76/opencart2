package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import TestBase.Basetest;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	Actions act=new Actions(driver);

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement myaccountbtn;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") 
	WebElement loginbtn;

	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement username;

	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement submit;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	WebElement forgotpassword;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/a")//*[@id="menu"]/div[2]/ul/li[1]/a
	WebElement Firstbar_desktops;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[1]/a")
	WebElement Firstbar_desktops_list_pc;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a") 
	WebElement Firstbar_desktops_list_mac;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a") 
	WebElement Firstbar_desktops_list_showalldesktops;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/a")//*[@id="menu"]/div[2]/ul/li[2]/a
	WebElement Firstbar_laptop_notebooks;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[3]/a")//*[@id="menu"]/div[2]/ul/li[3]/a
	WebElement Firstbar_components;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
	WebElement Firstbar_tablets;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[5]/a")
	WebElement Firstbar_software;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	WebElement Firstbar_phones_PDAs;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[7]/a")
	WebElement Firstbar_cameras;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[8]/a")
	WebElement Firstbar_MP3_player;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/div/a")
	WebElement New_customer_continue;

	@FindBy(xpath="//*[@id=\"account-login\"]/ul/li[1]/a/i")
	WebElement secondbar_Home;

	@FindBy(xpath="//*[@id=\"account-login\"]/ul/li[2]/a")
	WebElement Secondline_Account;

	@FindBy(xpath="//*[@id=\"account-login\"]/ul/li[3]/a")
	WebElement secondbar_login;

	@FindBy(xpath="//*[@id=\"form-currency\"]/div/button")
	WebElement currency_dropdown;

	@FindBy(xpath="//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	WebElement curreny_dropdown_Euro;

	@FindBy(xpath="//*[@id=\"form-currency\"]/div/ul/li[2]/button")
	WebElement curreny_dropdown_Pound_Sterling;

	@FindBy(xpath="//*[@id=\"form-currency\"]/div/ul/li[3]/button")
	WebElement curreny_dropdown_usdoller;

	@FindBy(xpath="//*[@id=\"cart-total\"]")
	WebElement Top_corner_cart_total;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[1]")
	WebElement Right_box_login;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[2]")
	WebElement Right_Box_register;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[3]")
	WebElement Right_box_ForgottenPassword;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[4]")
	WebElement Right_box_myaccount;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[5]")
	WebElement Right_box_addressbook;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[6]")
	WebElement Right_box_wishlist;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[7]")
	WebElement Right_box_OrderHistory;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[8]")
	WebElement Right_box_downloads;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[9]")
	WebElement Right_box_Recurringpayments;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[10]")
	WebElement Right_box_RewardPoints;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[11]")
	WebElement Right_box_Returns;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[12]")
	WebElement Right_box_Transactions;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	WebElement Right_box_Newsletter;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/i")
	WebElement Top_bar_phone;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/i")
	WebElement Top_bar_profile;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement Top_bar_profile_register;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Top_bar_profile_login;

	@FindBy(xpath="//*[@id=\"wishlist-total\"]/i")
	WebElement Top_bar_wishlist;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/i")
	WebElement Top_bar_cart;

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[5]/a/i")
	WebElement Top_bar_share;

	@FindBy(xpath="/html/body/footer/div/div/div[1]/ul/li[1]/a")
	WebElement footer_aboutus;

	@FindBy(xpath="/html/body/footer/div/div/div[1]/ul/li[2]/a")
	WebElement footer_DeliveryInformation;

	@FindBy(xpath="/html/body/footer/div/div/div[1]/ul/li[3]/a")
	WebElement footer_PrivacyPolicy;

	@FindBy(xpath="/html/body/footer/div/div/div[1]/ul/li[4]/a")
	WebElement footer_termsandconditions;

	@FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[1]/a")
	WebElement footer_contactus;

	@FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[2]/a")
	WebElement footer_returns;

	@FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[3]/a")
	WebElement footer_sitemaps;

	@FindBy(xpath="/html/body/footer/div/div/div[3]/ul/li[1]/a")
	WebElement footer_brands;

	@FindBy(xpath="/html/body/footer/div/div/div[3]/ul/li[2]/a")
	WebElement footer_giftcertificates;

	@FindBy(xpath="/html/body/footer/div/div/div[3]/ul/li[3]/a")
	WebElement footer_Affiliate;

	@FindBy(xpath="/html/body/footer/div/div/div[3]/ul/li[4]/a")
	WebElement footer_specials;

	@FindBy(xpath="/html/body/footer/div/div/div[4]/ul/li[1]/a")
	WebElement footer_myaccount;

	@FindBy(xpath="/html/body/footer/div/div/div[4]/ul/li[2]/a")
	WebElement footer_orderhistory;

	@FindBy(xpath="/html/body/footer/div/div/div[4]/ul/li[3]/a")
	WebElement footer_wishlist;

	@FindBy(xpath="/html/body/footer/div/div/div[4]/ul/li[4]/a")
	WebElement footer_newsletter;

	@FindBy(xpath="//*[@id=\"top\"]/div")
	WebElement topbar_fullbox;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]")
	WebElement Topsecondbar_fullbox;

	@FindBy(xpath="//*[@id=\"account-login\"]/ul")
	WebElement Topthirdbar_fullbox;

	@FindBy(xpath="/html/body/footer/div/div")
	WebElement footer_section_fullbox;

	@FindBy(xpath="/html/body/footer/div/div/div[1]")
	WebElement footer_section_informarionlist;

	@FindBy(xpath="/html/body/footer/div/div/div[2]")
	WebElement footer_section_customerandservicelist;

	@FindBy(xpath="/html/body/footer/div/div/div[3]")
	WebElement footer_section_extraslist;

	@FindBy(xpath="/html/body/footer/div/div/div[4]")
	WebElement footer_section_myaccountlist;

	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement logo;






	//Actions
	public void click_on_myaccountbtn()
	{
		myaccountbtn.click();
	}
	public void click_on_login_BTN()
	{
		loginbtn.click();
	}
	public void setusername(String email)
	{
		username.clear();
		username.sendKeys(email);
	}
	public void setpassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void click_on_forgotpassword()
	{                                                          
		forgotpassword.click();
	}
	public void click_on_Submit()
	{
		submit.click();
	}
	public void mouseover_on_desktop_clickon_pc()
	{
		act.moveToElement(Firstbar_desktops).perform();
		Firstbar_desktops_list_pc.click();
	}
	public void mouseover_on_desktop_clickon_mac()
	{
		act.moveToElement(Firstbar_desktops).perform();
		Firstbar_desktops_list_mac.click();
	}
	public void mouseover_on_desktop_clickon_showalldesktops()
	{
		act.moveToElement(Firstbar_desktops).perform();
		Firstbar_desktops_list_showalldesktops.click();
	}

}