package com.sauceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	public static void getscreenshot(WebDriver driver,String name) throws IOException
	{
		
		Calendar cal=Calendar.getInstance();
		Date dt=cal.getTime();
		String date=dt.toString().replace(":","").replace(" ","");
		String ssname=name.concat(date);
		String address="./Screenshotfolder/"+ssname+".jpg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(address);
		FileHandler.copy(sourceFile, destFile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
