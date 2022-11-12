package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.CartPagePOM;
import com.sauceDemo.POMPackage.CheckOutConfirmationPagePOM;
import com.sauceDemo.POMPackage.HomePagePOM;
import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TC09_VerifyCheckOutFunctionality extends TestBaseClass
{
	@Test
public void TC_09VerifyCheckOutFunctionality() throws IOException 
{
	HomePagePOM hp = new HomePagePOM(driver);
	hp.ClickOnaddBagtocart();
	hp.ClickOncartOptiontoviewproductsincart();
	CartPagePOM ct=new CartPagePOM(driver);
	ct.checkoutclick();
	UtilityClass.getscreenshot(driver,"TC_09 we enter on your information page after checkout");
	//validation
	CheckOutConfirmationPagePOM cnf= new CheckOutConfirmationPagePOM(driver);
	boolean actual=cnf.gettextofconfirmation();
	boolean expected=true;
	System.out.println(actual);
	Assert.assertEquals(actual, expected);
}
}
