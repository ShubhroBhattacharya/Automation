package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.util.Constants;

public class HomePage {
	protected WebDriver driver;
	
	//List of HomePage Objects
	public By zepoLogo                     = By.xpath("//*[@id=\"main_logo\"]");
	public By products                     = By.xpath("/html/body/div[3]/header/div/nav/ul/li[1]/a");
	public By enterprise                   = By.xpath("/html/body/div[3]/header/div/nav/ul/li[2]/a");
	public By pricing                      = By.xpath("/html/body/div[3]/header/div/nav/ul/li[3]/a");
	public By customers                    = By.xpath("/html/body/div[3]/header/div/nav/ul/li[4]/a");
	public By login                        = By.xpath("/html/body/div[3]/header/div/nav/ul/li[5]/a");
	public By startselling                 = By.xpath("/html/body/div[3]/header/div/nav/ul/li[6]/a");
	 
	public By startSellingNowButton        = By.xpath("//*[@id=\"welcome\"]/div[2]/div/div/div[1]/a");
	public By startSellingNowButton_popup  = By.xpath("//*[@id=\"frmRegistration\"]/button");
	public By overlayClose                 = By.xpath("/html/body/div[3]/div[1]/div[1]");
	public By whatCanIDoWithMyStore        = By.xpath("//*[@id=\"online_and_mobile\"]/div/div[2]/div[3]/a");
	public By howDoesThisWork              = By.xpath("//*[@id=\"promote_easily\"]/div/div[2]/div[3]/a");
	public By whyShouldIUseZepoLogistics   = By.xpath("//*[@id=\"deliver_products\"]/div/div[2]/div[3]/a");
	
	public By nameField_Footer             = By.xpath("//*[@id=\"fullNameHome\"]");
	public By emailField_Footer            = By.xpath("//*[@id=\"emailHome\"]");
	public By passwordField_Footer         = By.xpath("//*[@id=\"passwordHome\"]");
	public By startSellingNowButton_Footer = By.xpath("//*[@id=\"submitButtonHome\"]/div");
	public By doneNextButton_storesetup    = By.xpath("//*[@id=\"donestep1\"]/input");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	
	/**
	 * Checks the Page Title
	 * @param pageName : Enter Name of Page to be checked
	 * @return True or False
	 */
	public boolean verifyPageTitle(String pageName) {
		String expectedPageTitle = null;	
		switch(pageName) {
			case "HomePage":
				expectedPageTitle = Constants.PageTitles.ZEPO_HOME;
				break;
				
			case "whatCanIDoWithMyStore":
				expectedPageTitle = Constants.PageTitles.ONLINE_AND_MOBILE_STORE;
				break;
				
			case "howDoesThisWork":
				expectedPageTitle = Constants.PageTitles.ONLINE_STORE_MARKETING;
				break;
				
			case "whyShouldIUseZepoLogistics":
				expectedPageTitle = Constants.PageTitles.COURIER_COD;
				break;
		}
		
		return getPageTitle().contains(expectedPageTitle);
	}
	
	
	/**
	 * Checks if the element Exists
	 * @param elementName : reference of element that needs to be checked
	 * @return True or False
	 */
	public boolean existsElement(By elementName) {
		 try {
		        driver.findElement(elementName);
		    } catch (NoSuchElementException e) {
		        return false;
		    }
		    return true;
	}
	
}
