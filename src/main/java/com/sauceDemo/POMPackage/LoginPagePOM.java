package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM
{
        private WebDriver driver;
         @FindBy(xpath="//input[@id='user-name']")
         WebElement login;
         public void loginidenter()
         {
        	 login.sendKeys("standard_user");
        	
         }
         @FindBy(xpath="//input[@id='password']")
         WebElement password;
         public void passwordenter()
         {
        	 password.sendKeys("secret_sauce");
        	 
         }
         @FindBy(xpath="//input[@id='login-button']")
         WebElement loginbuttonclick;
         public void loginbuttonclick()
         {
        	 loginbuttonclick.click();
        	 
         }
 
         public LoginPagePOM(WebDriver driver)
         {
        	 this.driver=driver;
        	 PageFactory.initElements(driver,this);
         }
       
}
