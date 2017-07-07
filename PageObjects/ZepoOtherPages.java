package com.PageObjects;

import org.openqa.selenium.WebDriver;

import com.util.Constants;

public class ZepoOtherPages extends HomePage implements Constants {
	
	public ZepoOtherPages(WebDriver driver) {
		super(driver);
		
	}
	
	/**
	 * Checks the Title of each page
	 * @param pageName : enter name of page
	 * @return True or False
	 */
	public boolean verifyPageTitle(String pageName) {
		
		String expectedPageTitle = null;
		
		switch(pageName) {
		
		case "onlineAndMobileStore" :
			expectedPageTitle = Constants.PageTitles.ONLINE_AND_MOBILE_STORE;
			break;
			
		case "onlineStoreMarketingPage" :
			expectedPageTitle = Constants.PageTitles.ONLINE_STORE_MARKETING;
			break;
			
		case "courierCODPage" :
			expectedPageTitle = Constants.PageTitles.COURIER_COD;
			break;
		
		case "enterprisePage" :
			expectedPageTitle = Constants.PageTitles.ENTERPRISE;
			break;
			
		case "pricingPage" :
			expectedPageTitle = Constants.PageTitles.PRICING;
			break;	
			
		case "customerExamples" :
			expectedPageTitle = Constants.PageTitles.CUSTOMER_EXAMPLES;
			break;	
			
		case "customerTestimonials" :
			expectedPageTitle = Constants.PageTitles.CUSTOMER_TESTIMONIALS;
			break;	
			
		case "zepoBlog" :
			expectedPageTitle = Constants.PageTitles.ZEPO_BLOG;
			break;	
		}
		
		return getPageTitle().contains(expectedPageTitle);
	}
	
}

