package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM 
{
private WebDriver driver;
private Select s;
@FindBy(xpath="//button[@id='react-burger-menu-btn']")
WebElement menubutton;

public void clickmenubutton()
{
	menubutton.click();
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")
WebElement logoutbutton;
public void clickonlogoutbutton()
{
	logoutbutton.click();
}


@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement Addbagtocart;
public void ClickOnaddBagtocart()
{
	Addbagtocart.click();
	System.out.println("Clicked on add bag to cart");
}

@FindBy (xpath="//span[@class='shopping_cart_badge']")
WebElement addTocartLink;
public String gettextofaddtocart()
{
	String actualcount=addTocartLink.getText();
	return actualcount;
}


@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement clickoncartoption;
public void ClickOncartOptiontoviewproductsincart()
{
	clickoncartoption.click();
}

@FindBy(xpath="//select[@class='product_sort_container']")
WebElement Filter;
public void ClickOnFilter()
{
	Filter.click();
	s.selectByValue("za");
	System.out.println("Drop down filter with select z to a applied.");
}



@FindBy(xpath="//a[@id='about_sidebar_link']")
WebElement About;
public void clickonAbout()
{
	About.click();
	System.out.println("Clicked on about");
}
@FindBy(xpath="//button[text()='Add to cart']")
private List<WebElement>SelectAll;

public void clickallproducts()
{
	for(WebElement List: SelectAll)
	{
		List.click();
	}
}

@FindBy(xpath="//span[@class='active_option']")
WebElement Filtergettext;

public String gettextofFilter()
{
	String actual=Filtergettext.getText();
	return actual;
}



public HomePagePOM(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	s=new Select(Filter);
}
}
