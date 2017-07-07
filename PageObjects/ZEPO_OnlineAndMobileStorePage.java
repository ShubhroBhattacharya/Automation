package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.util.Constants;

public class ZEPO_OnlineAndMobileStorePage extends HomePage implements Constants {
	
	public String onlineAndMobileStorePageURL = Constants.PageURL.ONLINE_AND_MOBILE_STORE;
	
	public By startSellingNowButtonTop        = By.xpath("/html/body/div[3]/section[1]/div/div/div/a");
	public By startSellingNowButtonBottom     = By.xpath("/html/body/div[3]/section[4]/div/div[3]/a");
	public By startSellingNowButton_popup     = By.xpath("//*[@id=\"frmRegistration\"]/button");
	public By overlayClose                    = By.xpath("/html/body/div[3]/div[1]/div[1]");
	
	public ZEPO_OnlineAndMobileStorePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean existsElement(By elementName) {
		 try {
		        driver.findElement(elementName);
		    } catch (NoSuchElementException e) {
		        return false;
		    }
		    return true;
	}
}
