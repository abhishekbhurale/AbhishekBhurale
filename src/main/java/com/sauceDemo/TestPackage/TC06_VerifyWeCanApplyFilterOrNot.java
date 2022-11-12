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

public class TC06_VerifyWeCanApplyFilterOrNot extends TestBaseClass
{
	@Test
	public void TC_06VerifyWeCanApplyFilterOrNot() throws IOException, InterruptedException 
	{
		HomePagePOM hp=new HomePagePOM(driver);
		hp.ClickOnFilter();
		Thread.sleep(5000);
		UtilityClass.getscreenshot(driver,"TC_06 Filter applied");
		//validation
	    String	actual=hp.gettextofFilter();
	    String expected ="NAME (Z TO A)";
	    System.out.println(actual);
	  	Assert.assertEquals(expected,actual);
	}
}
