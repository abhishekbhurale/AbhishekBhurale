package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.LoginPagePOM;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TestBaseClass
{
    WebDriver driver;
  Logger log= Logger.getLogger("SaucedemoMavenproject");
    
    
    @Parameters("browsername")
	@BeforeMethod
	public void SetUp(String browsername) throws IOException, InterruptedException 
	{
    	if(browsername.equals("chrome"))
    	{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFiles/chromedriver.exe");
	    driver =new ChromeDriver();
    	}
    	else 
    	{
	    System.setProperty("webdriver.gecko.driver",
				"./DriverFiles/geckodriver.exe");
	    driver =new FirefoxDriver();
    	}
	    
    	PropertyConfigurator.configure("log4j.properties");
	 
    	   log.info("Browser is opened");
		driver.manage().window().maximize();
		   log.info("Browser is maximized");
		driver.get("https://www.saucedemo.com/");
		   log.info("URL is opened");
		   log.info("Went on login page");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.loginidenter();
		log.info("Username is entered.");
		lp.passwordenter();
		log.info("Password is entered");
		lp.loginbuttonclick();
		log.info("Clicked on login button");
   	    log.info("We entered on home page.");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		   log.info("End of program");
		   log.info("Browser is closed");
		driver.close();
		
	}
}
