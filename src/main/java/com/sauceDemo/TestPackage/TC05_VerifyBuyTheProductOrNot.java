package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.CartPagePOM;
import com.sauceDemo.POMPackage.CheckOutConfirmationPagePOM;
import com.sauceDemo.POMPackage.CheckOutOverViewPagePOM;
import com.sauceDemo.POMPackage.HomePagePOM;
import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TC05_VerifyBuyTheProductOrNot extends TestBaseClass 
{
	@Test
public void TC_05VerifyBuyTheProductOrNot()  throws IOException, InterruptedException
{
	HomePagePOM hp= new HomePagePOM(driver);
	hp.ClickOnaddBagtocart();
	UtilityClass.getscreenshot(driver, "TC_05 Add to cart product of bag");
	hp.ClickOncartOptiontoviewproductsincart();
	Thread.sleep(5000);
	CartPagePOM cp= new CartPagePOM(driver);
	cp.checkoutclick();
	CheckOutConfirmationPagePOM cnf = new CheckOutConfirmationPagePOM(driver);
	cnf.sendFirstname();
	cnf.sendLastname();
	cnf.Postalcodeenter();
	UtilityClass.getscreenshot(driver, "TC_05We Entered our details for Buying the Product.");
	cnf.ClickOncontinuebutton();
	System.out.println("We clicked on continue button and enter on completion page.");
	CheckOutOverViewPagePOM overview =new CheckOutOverViewPagePOM(driver);
	overview.finishbuttonclick();
	UtilityClass.getscreenshot(driver, "TC_05 We have succesfully Buy the Product.");
	//validation
	System.out.println("Apply for validation");
	String actual=overview.Confirmation();
	String expected ="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
    Assert.assertEquals(actual,expected);
}
}
