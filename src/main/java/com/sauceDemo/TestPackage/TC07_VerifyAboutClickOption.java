package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.AboutPagePOM;
import com.sauceDemo.POMPackage.HomePagePOM;
import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;



public class TC07_VerifyAboutClickOption extends TestBaseClass 
{
	@Test
	public void TC_07VerifyAboutClickOption() throws IOException, InterruptedException 
	{
		HomePagePOM hp=new HomePagePOM(driver);
		hp.clickmenubutton();
		Thread.sleep(5000);
		hp.clickonAbout();
		UtilityClass.getscreenshot(driver,"TC_07 About page clickable");
		//Validation
		AboutPagePOM abt= new AboutPagePOM(driver);
		 boolean actual=abt.isdislpayedAboutpage();
		 boolean expected= true;
		 Assert.assertEquals(expected, actual);
		System.out.println("End of program");	
	}
}
