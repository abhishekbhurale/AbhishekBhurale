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

public class TC03_VerifyWeCanAddProductToCart extends TestBaseClass
{
	  @Test
      public  void TC_03VerifyWeCanAddProductToCart() throws IOException, InterruptedException 
      {
    	  HomePagePOM hp=new HomePagePOM(driver);
    	  hp.ClickOnaddBagtocart();
    	  Thread.sleep(5000);
    	  UtilityClass.getscreenshot(driver,"TC_03 Prodcts added in cart for bag selection");
    	  //Validation
    	  System.out.println("Apply validation");
    	  String expectedresult="1";
    	  String actualresult= hp.gettextofaddtocart();
    	  System.out.println("Number of products in cart= "+actualresult);
    	  Assert.assertEquals(actualresult, expectedresult);
    	  
	}
}
