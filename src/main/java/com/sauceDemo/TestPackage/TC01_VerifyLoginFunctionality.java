package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void TC_01VerifyLoginFunctionality() throws IOException
	{
		
		UtilityClass.getscreenshot(driver,"TC_01Homepagescreenshot");
		//Validation
		log.info("Apply validation for login");
		String expectedtitle ="Swag Labs";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(expectedtitle,actualtitle);
	}
	
}
