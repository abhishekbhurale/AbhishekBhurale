package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutConfirmationPagePOM 
{

	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;
	public void sendFirstname()
	{
		Firstname.sendKeys("Hii");
		System.out.println("First name entered as Hii");
		
	}
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastName;
	public void sendLastname()
	{
		LastName.sendKeys("Hello");
		System.out.println("Lastname entered as Hello");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement Postalcode;
	public void Postalcodeenter()
	{
		Postalcode.sendKeys("12345");
		System.out.println("Postal code enter as 12345");
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueclick;
	public void ClickOncontinuebutton()
	{
		continueclick.click();
		System.out.println("Clicked on continue");
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement confirmationisdisplayed;
	public boolean gettextofconfirmation()
	{
		return confirmationisdisplayed.isDisplayed();
	
	}
	public CheckOutConfirmationPagePOM (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
