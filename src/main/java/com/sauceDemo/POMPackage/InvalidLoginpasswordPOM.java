package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginpasswordPOM 
{
	private WebDriver driver;
	
	
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Invalidloginid;
      
	public void invalidloginidinput()
	{
		Invalidloginid.sendKeys("Hii");
		System.out.println("Invalid login id enter");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Invalidpassword;
	
	public void invalidpassword()
	{
	Invalidpassword.sendKeys("Hello");	
	System.out.println("Invalid password enter");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Loginbuttonclick;
	public void Loginbuttonclick()
	{
		Loginbuttonclick.click();
		
	}
	
	@FindBy(xpath="//h3[text()='Epic sadface: Username and password do not match any user in this service']")
		WebElement errormsg;
	public String errormsggettext()
	{
		String actual=errormsg.getText();
		return actual;
	}
	

	public InvalidLoginpasswordPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
}
