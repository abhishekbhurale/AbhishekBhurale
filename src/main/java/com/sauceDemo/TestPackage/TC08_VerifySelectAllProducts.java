package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.HomePagePOM;
import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TC08_VerifySelectAllProducts extends TestBaseClass
{
	@Test
	public void TC_08VerifySelectAllProducts() throws IOException 
	{
		        HomePagePOM hp = new HomePagePOM(driver);
		        hp.clickallproducts();
		        UtilityClass.getscreenshot(driver,"TC_08 Add all products in cart");
		        //validation
		System.out.println("Apply validation");
		String actual=hp.gettextofaddtocart();
		System.out.println(hp.gettextofaddtocart());
		String expected="6";
		Assert.assertEquals(actual,expected);
	}
}
