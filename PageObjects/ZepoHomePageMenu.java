package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.Constants;


public class ZepoHomePageMenu extends HomePage implements Constants {

	public By menuSliderButton          = By.xpath("/html/body/div[3]/header/div/div[2]/ul/li/a");
	public By closeToggleMenuButton     = By.xpath("/html/body/section[1]/a");
	public By sellOnMarketPlaces        = By.xpath("/html/body/section[1]/ul[1]/li[1]/a");
	public By facebookStore             = By.xpath("/html/body/section[1]/ul[1]/li[2]/a");
	public By automatedAdvertising      = By.xpath("/html/body/section[1]/ul[1]/li[3]/a");
	public By themeCustomizationService = By.xpath("/html/body/section[1]/ul[1]/li[4]/a");
	public By features                  = By.xpath("/html/body/section[1]/ul[1]/li[5]/a");
	public By themes                    = By.xpath("/html/body/section[1]/ul[1]/li[6]/a");
	public By androidIosApp             = By.xpath("/html/body/section[1]/ul[1]/li[7]/a");
	public By theTeam                   = By.xpath("/html/body/section[1]/ul[2]/li[1]/a");
	public By careers                   = By.xpath("/html/body/section[1]/ul[2]/li[2]/a");
	public By getInTouch                = By.xpath("/html/body/section[1]/ul[2]/li[3]/a");
	public By partnerWithUs             = By.xpath("/html/body/section[1]/ul[2]/li[4]/a");
	public By zepoBlogForSMB            = By.xpath("/html/body/section[1]/ul[3]/li[1]/a");
	public By eBook                     = By.xpath("/html/body/section[1]/ul[3]/li[2]/a");
	public By zepoVsShopifyKartrocket   = By.xpath("/html/body/section[1]/ul[3]/li[3]/a");
	public By downloadOnGooglePlay      = By.xpath("/html/body/section[1]/ul[4]/li/a");
	
	
	public ZepoHomePageMenu(WebDriver driver) {
		super(driver);
		
	}
	
	/**
	 * Check the presence of the close Toggle Menu Button
	 * @return
	 */
	public boolean existsCloseToggleMenuButton() {
	    try {
	        driver.findElement(closeToggleMenuButton);
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
	
	public void clickOnMenuButton() {
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		WebElement menuSliderButton = null;
		/*try {
			WebElement webengageCancel = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));
			
			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch(Exception e){}*/
		
		try {
			menuSliderButton = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.menuSliderButton));
		System.out.println("Opening the Menu Slider in Zepo Home Page");
		} catch (NoSuchElementException e){
			System.out.println("MENU Button not Found");
			}
		menuSliderButton.click();
	}
	
	/**
	 * Checks the Page Title
	 * @param pageName : Name of the page to be checked
	 * @return True or False
	 */
	public boolean verifyPageTitle(String pageName) {	
		String expectedPageTitle = null;	
		switch(pageName) {
			
			case "sellOnMarketPlaces" :
				expectedPageTitle = Constants.PageTitles.SELL_ON_MARKETPLACES;
				break;
			
			case "facebookStore" :
				expectedPageTitle = Constants.PageTitles.FACEBOOK_STORE;
				break;
			
			case "automatedAdvertising" :
				expectedPageTitle = Constants.PageTitles.AUTOMATED_ADVERTISING;
				break;
			
			case "themeCustomizationService" :
				expectedPageTitle = Constants.PageTitles.THEME_CUSTOMIZATION_SERVICE;
				break;
				
			case "features" :
				expectedPageTitle = Constants.PageTitles.FEATURES;
				break;
			
			case "themes" :
				expectedPageTitle = Constants.PageTitles.THEMES;
				break;
				
			case "androidIosApp" :
				expectedPageTitle = Constants.PageTitles.ANDROID_IOS_PAGE;
				break;
				
			case "theTeam" :
				expectedPageTitle = Constants.PageTitles.THE_TEAM;
				break;
			
			case "careers" :
				expectedPageTitle = Constants.PageTitles.CAREERS;
				break;
			
			case "getInTouch" :
				expectedPageTitle = Constants.PageTitles.GET_IN_TOUCH;
				break;
				
			case "partnerWithUs" :
				expectedPageTitle = Constants.PageTitles.PARTNER_WITH_US;
				break;
			
			case "zepoBlogForSMB" :
				expectedPageTitle = Constants.PageTitles.ZEPO_BLOG;
				break;
				
			case "eBook" :
				expectedPageTitle = Constants.PageTitles.EBOOK;
				break;
			
			case "zepoVsShopifyKartrocket" :
				expectedPageTitle = Constants.PageTitles.ZEPO_VS;
				break;
				
				
		}
		return getPageTitle().contains(expectedPageTitle);
		
		
	}
	
	
	
}
