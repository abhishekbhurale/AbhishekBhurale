package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPagePOM
{
WebDriver driver;

@FindBy(xpath="//button[@id='finish']")
WebElement finishbutton;

public void finishbuttonclick()
{
	finishbutton.click();
}
	@FindBy(xpath="//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")
	WebElement completeconfirmation;
	public String Confirmation()
	{
		String confirmation=completeconfirmation.getText();
		return confirmation;
	}
	
	public CheckOutOverViewPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
}
