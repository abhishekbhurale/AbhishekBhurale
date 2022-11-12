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

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
@Test
public  void TC_02VerifyLogOutFunctionality() throws IOException, InterruptedException 
{
	
	UtilityClass.getscreenshot(driver, "TC_02 Loginpage screenshot");
	Thread.sleep(5000);
	UtilityClass.getscreenshot(driver, "TC_02 Homepage screenshot");
	HomePagePOM hm =new HomePagePOM(driver);
	hm.clickmenubutton();
	log.info("Clicked on main menue");
	hm.clickonlogoutbutton();
	log.info("Clicked on Logout Button");
	UtilityClass.getscreenshot(driver,"TC_02 After Logout Screenshot");
	log.info("Went on Loginpage after Logout");
	//Validation
	log.info("Apply validation");
	String expectedTitle = "Swag Labs";   
	String actaulTitle =driver.getTitle();	
	Assert.assertEquals(actaulTitle, expectedTitle);

}	
}
