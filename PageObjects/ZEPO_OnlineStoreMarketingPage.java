package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.util.Constants;

public class ZEPO_OnlineStoreMarketingPage extends HomePage implements Constants {
	
	public String onlineStoreMarketingPageURL = Constants.PageURL.ONLINE_STORE_MARKETING;
	public By getStartedNowTop                = By.xpath("/html/body/div[3]/section[1]/div/div/div/a");
	public By startSellingNowButtonBottom     = By.xpath("//*[@id=\"frmSubmit\"]");
	
	public By nameField_Footer                = By.xpath("//*[@id=\"senderName\"]");
	public By emailField_Footer               = By.id("senderEmail");
	public By contactNumber_Footer            = By.id("senderContactNumber");
	
	public ZEPO_OnlineStoreMarketingPage(WebDriver driver) {
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
