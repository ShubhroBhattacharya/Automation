package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.ZEPO_OnlineAndMobileStorePage;
import com.PageObjects.ZepoOtherPages;
import com.base.ZepoHomePageSetup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ZEPO_OnlineAndMobileStorePageTests extends ZepoHomePageSetup {

	private WebDriver driver;
	private ExtentReports report;
	private ExtentTest logger;
	private String className = "ZEPO | OnlineAndMobileStorePageTests | ";
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		report = getReport();
		logger = getLogger();
	}
	
	@Test(priority = 0)
	public void clickStartSellingNowButtonTop() throws InterruptedException {
		ZEPO_OnlineAndMobileStorePage onlineAndMobileStorePage = new ZEPO_OnlineAndMobileStorePage(driver);
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify that Pop Up opens up on Clicking Start Selling Now button(TOP) ");
		
		driver.navigate().to(onlineAndMobileStorePage.onlineAndMobileStorePageURL);
		Assert.assertTrue(otherPage.verifyPageTitle("onlineAndMobileStore"));
		logger.log(LogStatus.PASS, "ZEPO | Online and Mobile Store Page Opened");
		
		Assert.assertTrue(onlineAndMobileStorePage.existsElement(onlineAndMobileStorePage.startSellingNowButtonTop));
		logger.log(LogStatus.INFO, "Start Selling Now Button Detected");
		
		WebElement startSellingNowButtonTop = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineAndMobileStorePage.startSellingNowButtonTop));
		System.out.println("Clicking on Start Selling Now Button in Zepo Home Page");
		startSellingNowButtonTop.click();
		logger.log(LogStatus.PASS, "Start Selling Now Button Clicked");

		Assert.assertTrue(onlineAndMobileStorePage.existsElement(onlineAndMobileStorePage.startSellingNowButton_popup));
		logger.log(LogStatus.INFO, "Pop up form Detected");
		
		WebElement overlayClose = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineAndMobileStorePage.overlayClose));
		System.out.println("Clicking on Cancel Button in Overlay");
		overlayClose.click();
		logger.log(LogStatus.PASS, "Pop up form Closed");
		
		logger.log(LogStatus.PASS, "Popup for filling information opened and Closed");
	}
	
	@Test(priority = 1)
	public void clickStartSellingNowButtonBottom() throws InterruptedException {
		ZEPO_OnlineAndMobileStorePage onlineAndMobileStorePage = new ZEPO_OnlineAndMobileStorePage(driver);
		logger = report.startTest(className + "Verify that Pop Up opens up on Clicking Start Selling Now button(BOTTOM) ");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/section[4]/div/h3")));
		actions.perform();
		logger.log(LogStatus.INFO, "Scroll down to locate Start Selling Now Button");
		
		Assert.assertTrue(onlineAndMobileStorePage.existsElement(onlineAndMobileStorePage.startSellingNowButtonBottom));
		logger.log(LogStatus.INFO, "Start Selling Now Button Detected");
		
		WebElement startSellingNowButtonTop = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineAndMobileStorePage.startSellingNowButtonBottom));
		startSellingNowButtonTop.click();
		logger.log(LogStatus.PASS, "Start Selling Now Button Clicked");

		Assert.assertTrue(onlineAndMobileStorePage.existsElement(onlineAndMobileStorePage.startSellingNowButton_popup));
		logger.log(LogStatus.INFO, "Pop up form Detected");
		
		WebElement overlayClose = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineAndMobileStorePage.overlayClose));
		System.out.println("Clicking on Cancel Button in Overlay");
		overlayClose.click();
		logger.log(LogStatus.PASS, "Pop up form Closed");
		
		logger.log(LogStatus.PASS, "Popup for filling information opened and Closed");
	
	}

	}
