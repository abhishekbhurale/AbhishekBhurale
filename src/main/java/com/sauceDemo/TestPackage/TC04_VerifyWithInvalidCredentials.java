package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.InvalidLoginpasswordPOM;
import com.sauceDemo.UtilityPackage.UtilityClass;



public class TC04_VerifyWithInvalidCredentials 
{
	@Test
    public void TC_04VerifyWithInvalidCredentials() throws InterruptedException, IOException 
    {
		System.setProperty("webdriver.chrome.driver",
				"D:\\VELOCITY\\SELENIUM FILES\\driver\\chromedriver.exe");
    	
		
		WebDriver driver=new ChromeDriver();
    	
    	System.out.println("Browser is opened");
    	driver.manage().window().maximize();
    	System.out.println("Browser is maximize");
    	driver.get("https://www.saucedemo.com/");
    	System.out.println("URL is entered");
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	InvalidLoginpasswordPOM  iv=new InvalidLoginpasswordPOM (driver);
    	iv.invalidloginidinput();
    	Thread.sleep(3000);
    	UtilityClass.getscreenshot(driver,"TC_04 Invalid login id enter");
    	iv.invalidpassword();
    	iv.Loginbuttonclick();
    	UtilityClass.getscreenshot(driver,"TC_04 Invalid credentials For login");
    	
    	//validation
    	System.out.println("Apply for validation");
    	String actualmsg=iv.errormsggettext();
    	System.out.println("text msg after invalid credentials are-->"+iv.errormsggettext());
    	String expected="Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualmsg,expected);
    	System.out.println("End of program");
    	System.out.println("Browser is closed");
    	driver.close();	
	}	
}
