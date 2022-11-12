package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOM 
{

	WebDriver driver;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	public void checkoutclick()
	{
		checkout.click();
		System.out.println("Clicked on checkout option");
	}
	
	
	public CartPagePOM (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
