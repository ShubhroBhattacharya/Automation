package com.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static String captureScreenshot(WebDriver driver, String screenshotName) {
		try 
		{
		// Create refernce of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		// Call method to capture screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);
		 
		// Copy files to specific location here it will save all screenshot in our project home directory and
		// result.getName() will return name of test case so that screenshot name will be same
		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		System.out.println("Screenshot taken");
		
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
			}
		
		return "./Screenshots/"+screenshotName+".png";
		
	}
}
