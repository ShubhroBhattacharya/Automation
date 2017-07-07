package com.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.ZepoOtherPages;
import com.base.ZepoHomePageSetup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Constants;

public class ZepoOtherPagesTests extends ZepoHomePageSetup implements Constants{
	
	private WebDriver driver;
	private ExtentReports report;
	private ExtentTest logger;
	private String className = "ZEPO | OtherHeaderPagesTests | ";
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		report = getReport();
		logger = getLogger();
	}
	@Test(priority = 0)
	public void verifyOnlineAndMobileStorePage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Online and Mobile Store Page Title ");
		driver.navigate().to(Constants.PageURL.ONLINE_AND_MOBILE_STORE);
		System.out.println("Zepo Online and Mobile Store Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("onlineAndMobileStore"), "Online and Mobile Store page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Online and Mobile Store Page Title verified");
	}
	
	@Test(priority = 1)
	public void verifyOnlineStoreMarketingPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Online Store Marketing Page Title ");
		driver.navigate().to(Constants.PageURL.ONLINE_STORE_MARKETING);
		System.out.println("Zepo Online Store Marketing Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("onlineStoreMarketingPage"), "Online Store Marketing page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Online Store Marketing Page Title verified");
	}
	
	@Test(priority = 2)
	public void verifyCourierCODPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Courier/COD Page Title ");
		driver.navigate().to(Constants.PageURL.COURIER_COD);
		System.out.println("Zepo Courier/COD Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("courierCODPage"), "Courier/COD page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Courier/COD Page Title verified");
	}
	
	@Test(priority = 3)
	public void verifyEnterprisePage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Enterprise Page Title ");
		driver.navigate().to(Constants.PageURL.ENTERPRISE);
		System.out.println("Zepo Enterprise Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("enterprisePage"), "Enterprise page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Enterprise Page Title verified");
	}
	
	@Test(priority = 4)
	public void verifyPricingPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Pricing Page Title ");
		driver.navigate().to(Constants.PageURL.PRICING);
		System.out.println("Zepo Pricing Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("pricingPage"), "Pricing page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Pricing Page Title verified");
	}
	
	@Test(priority = 5)
	public void verifyCustomerExamplesPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo CustomerExamples Page Title ");
		driver.navigate().to(Constants.PageURL.CUSTOMER_EXAMPLES);
		System.out.println("Zepo CustomerExamples Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("customerExamples"), "Customer Examples page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | CustomerExamples Page Title verified");
	}
	
	@Test(priority = 6)
	public void verifyCustomerTestimonialsPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo CustomerTestimonials Page Title ");
		driver.navigate().to(Constants.PageURL.CUSTOMER_TESTIMONIALS);
		System.out.println("Zepo CustomerTestimonials Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("customerTestimonials"), "Customer Testimonials page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | CustomerTestimonials Page Title verified");
	}
	
	@Test(priority = 7)
	public void verifyZepoBlogPage() {
		ZepoOtherPages otherPage = new ZepoOtherPages(driver);
		logger = report.startTest(className + "Verify Zepo Blog Page Title ");
		driver.navigate().to(Constants.PageURL.ZEPO_BlOG);
		System.out.println("Zepo Blog Page | Verifying Page Title");
		Assert.assertTrue(otherPage.verifyPageTitle("zepoBlog"));
		logger.log(LogStatus.PASS, "ZEPO | Blog Page Title verified");
	}
	
}
