package com.Tests;

import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.ZEPO_OnlineStoreMarketingPage;
import com.PageObjects.ZepoOtherPages;
import com.base.ZepoHomePageSetup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Constants;

public class ZEPO_OnlineStoreMarketingPageTests extends ZepoHomePageSetup {
	private WebDriver driver;
	private ExtentReports report;
	private ExtentTest logger;
	private String className = "ZEPO | OnlineStoreMarketingPageTests | ";
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		report = getReport();
		logger = getLogger();
	}
	
	@Test(priority = 0,enabled = false)
	public void clickGetStartedNowButtonTop() throws InterruptedException {
		ZEPO_OnlineStoreMarketingPage onlineStoreMarketingPage = new ZEPO_OnlineStoreMarketingPage(driver);
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify that Screen scrolls down to Form Fill-up in Footer on Clicking Get Started Now button(TOP) ");
		
		driver.navigate().to(onlineStoreMarketingPage.onlineStoreMarketingPageURL);
		Assert.assertTrue(otherPage.verifyPageTitle("onlineStoreMarketingPage"));
		logger.log(LogStatus.PASS, "ZEPO | Online Store Marketing Page Opened");
		
		Assert.assertTrue(onlineStoreMarketingPage.existsElement(onlineStoreMarketingPage.getStartedNowTop));
		logger.log(LogStatus.INFO, "Get Started Now Button Detected");
		
		WebElement getStartedNowTop = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineStoreMarketingPage.getStartedNowTop));
		getStartedNowTop.click();
		logger.log(LogStatus.PASS, "Get Started Now Button Clicked");
		
		@SuppressWarnings("unused")
		WebElement startSellingNowButtonBottom = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineStoreMarketingPage.startSellingNowButtonBottom));
		Assert.assertTrue(onlineStoreMarketingPage.existsElement(onlineStoreMarketingPage.startSellingNowButtonBottom));
		logger.log(LogStatus.PASS, "Scroll down to Start Selling Now Button at the bottom of the page");
		
	}
	
	@Test(priority = 1)
	public void fillFormForSignUpInHomePageFooter() throws InterruptedException {
		
		String name      = "Zepo Test";
		String email     = "zepotest" + (UUID.randomUUID().toString()) + "@zepotest.in";
		String contactNo = "9999999999";

		ZEPO_OnlineStoreMarketingPage onlineStoreMarketingPage = new ZEPO_OnlineStoreMarketingPage(driver);
		driver.navigate().to(Constants.PageURL.ONLINE_STORE_MARKETING);
		logger = report.startTest(className + "Verify that Enquiry is sent correctly by Filling Form in footer ");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/h3")));
		actions.perform();
		logger.log(LogStatus.PASS, "Scroll down to locate Enquiry Form in the Footer");
		
		driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div/h3"));
		List<WebElement> username = driver.findElements(onlineStoreMarketingPage.nameField_Footer);
		for(WebElement user: username) {
			user.sendKeys(name);
		}
		List<WebElement> useremail = driver.findElements(onlineStoreMarketingPage.emailField_Footer);
		for(WebElement emailID: useremail) {
			emailID.sendKeys(email);
		}
		
		List<WebElement> userNo = driver.findElements(onlineStoreMarketingPage.contactNumber_Footer);
		for(WebElement num: userNo) {
			num.sendKeys(contactNo);
		}
		logger.log(LogStatus.INFO, "Enquiry Form filled");
		
		WebElement startSellingNowButtonBottom = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(onlineStoreMarketingPage.startSellingNowButtonBottom));
		startSellingNowButtonBottom.click();
		logger.log(LogStatus.PASS, "Start Selling Now Button in Footer Clicked");

		try {
			Assert.assertTrue(onlineStoreMarketingPage.existsElement(By.xpath("//*[@id=\"contactresponse\"]")));
			logger.log(LogStatus.PASS, "Enquiry was sent Successfully");
				
			} catch(Exception e) {
				}
		}

	}
