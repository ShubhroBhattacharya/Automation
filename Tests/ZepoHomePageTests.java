package com.Tests;

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

import com.PageObjects.HomePage;
import com.base.ZepoHomePageSetup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Constants;

public class ZepoHomePageTests extends ZepoHomePageSetup {

	private WebDriver driver;
	private ExtentReports report;
	private ExtentTest logger;
	private String className = "ZEPO | HomePageTests | ";

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		report = getReport();
		logger = getLogger();
	}

	@Test(priority = 0)
	public void verifyHomePage() {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify Zepo Home Page Title ");

		System.out.println("Zepo Home Page | Verifying Page Title");
		Assert.assertTrue(homePage.verifyPageTitle("HomePage"), "Home page title does not match");
		logger.log(LogStatus.PASS, "Zepo Home Page Title verified");
	}

	@Test(priority = 1)
	public void verifyZepoLogo() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of the Zepo Logo ");

		Assert.assertTrue(homePage.existsElement(homePage.zepoLogo));
		logger.log(LogStatus.PASS, "Zepo Logo verified");
		
	}
	
	@Test(priority = 2)
	public void verifyProductsInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of Products in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.products));
		logger.log(LogStatus.PASS, "Products in Header verified");
		
	}
	
	@Test(priority = 3)
	public void verifyEnterpriseInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of Enterprise in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.enterprise));
		logger.log(LogStatus.PASS, "Enterprise in Header verified");
		
	}
		
	@Test(priority = 4)
	public void verifyPricingInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of Pricing in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.pricing));
		logger.log(LogStatus.PASS, "Pricing in Header verified");
		
	}	
		
	@Test(priority = 5)
	public void verifyCustomersInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of Customers in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.customers));
		logger.log(LogStatus.PASS, "Customers in Header verified");
		
	}		
		
	@Test(priority = 6)
	public void verifyLoginInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of Login in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.login));
		logger.log(LogStatus.PASS, "Login in Header verified");
		
	}		
		
	@Test(priority = 7)
	public void verifyStartSellingInHeader() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify the Presence of StartSelling in Header ");

		Assert.assertTrue(homePage.existsElement(homePage.startselling));
		logger.log(LogStatus.PASS, "StartSelling in Header verified");
		
	}		
		

	@Test(priority = 8)
	public void clickStartSellingNowButton() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify that Pop Up opens up on Clicking Start Selling Now button ");
		// Handling WebEngage Popup
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));

			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch (Exception e) {
		}
		
		System.out.println("Checking the Presence of the Start Selling Now Button");
		Assert.assertTrue(homePage.existsElement(homePage.startSellingNowButton), "Start Selling Now Button not found");
		logger.log(LogStatus.INFO, "Start Selling Now Button Detected");
		
		WebElement startSellingNowButton = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.startSellingNowButton));
		System.out.println("Clicking on Start Selling Now Button in Zepo Home Page");
		startSellingNowButton.click();
		logger.log(LogStatus.PASS, "Start Selling Now Button Clicked");

		Assert.assertTrue(homePage.existsElement(homePage.startSellingNowButton_popup),
				"Start Selling now not found in Internal Pop-up");
		logger.log(LogStatus.INFO, "Pop up form Detected");
		
		WebElement overlayClose = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.overlayClose));
		System.out.println("Clicking on Cancel Button in Overlay");
		overlayClose.click();
		logger.log(LogStatus.PASS, "Pop up form Closed");
		
		logger.log(LogStatus.PASS, "Popup for filling information opened and Closed");
	}

	@Test(priority = 9)
	public void clickWhatCanIDoWithMyStoreButton() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		logger = report.startTest(className + "Verify that Page Redirects correctly on Clicking whatCanIDoWithMyStore ");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"online_and_mobile\"]/div/div[2]/div[2]/div[3]")));
		actions.perform();
		logger.log(LogStatus.INFO, "Scroll down to locate What I Can Do With My Store Button");
		System.out.println("Clicking on What Can I Do With My Store in Zepo Home Page");

		WebElement whatCanIDoWithMyStore = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.whatCanIDoWithMyStore));
		whatCanIDoWithMyStore.click();
		logger.log(LogStatus.PASS, "What I Can Do With My Store Button Clicked");
		
		Assert.assertTrue(homePage.verifyPageTitle("whatCanIDoWithMyStore"), "Redirected page title does not match");
		logger.log(LogStatus.PASS, "Page Redirected Correctly");
	}

	@Test(priority = 10)
	public void clickHowDoesThisWorkButton() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		driver.get(Constants.PageURL.ZEPO_HOME);
		logger.log(LogStatus.PASS, "Redirecting To Zepo Home Page");
		logger = report.startTest(className + "Verify that Page Redirects correctly on Clicking howDoesThisWork ");
		// Handling WebEngage Popup
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));

			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch (Exception e) {
		}

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"promote_easily\"]/div/div[2]/div[1]/div[2]")));
		actions.perform();
		logger.log(LogStatus.PASS, "Scroll down to locate How Does This Work Button");

		WebElement howDoesThisWork = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.howDoesThisWork));
		howDoesThisWork.click();
		logger.log(LogStatus.PASS, "How Does This Work Button Clicked");
		
		Assert.assertTrue(homePage.verifyPageTitle("howDoesThisWork"), "Redirected page title does not match");
		logger.log(LogStatus.PASS, "Page Redirected Correctly");
	}

	@Test(priority = 11)
	public void clickWhyShouldIUseZepoLogisticsButton() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		driver.get(Constants.PageURL.ZEPO_HOME);
		logger.log(LogStatus.PASS, "Redirecting To Zepo Home Page");
		logger = report.startTest(className + "Verify that Page Redirects correctly on Clicking whyShouldIUseZepoLogistics ");
		// Handling WebEngage Popup
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));

			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch (Exception e) {
		}

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"deliver_products\"]/div/div[2]/div[2]/div[2]")));
		actions.perform();
		logger.log(LogStatus.PASS, "Scroll down to locate Why Should I Use Zepo Logistics Button");

		WebElement whyShouldIUseZepoLogistics = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.whyShouldIUseZepoLogistics));
		whyShouldIUseZepoLogistics.click();
		logger.log(LogStatus.PASS, "Why Should I Use Zepo Logistics Button Clicked");
		
		Assert.assertTrue(homePage.verifyPageTitle("whyShouldIUseZepoLogistics"),
				"Redirected page title does not match");
		logger.log(LogStatus.PASS, "Page Redirected Correctly");
	}

	@Test(priority = 12,enabled = false)
	public void fillFormForSignUpInHomePageFooter() throws InterruptedException {

		String name = "Zepo Test";
		String email = "zepotest" + (UUID.randomUUID().toString()) + "@zepotest.in";
		String password = "1";

		HomePage homePage = new HomePage(driver);
		driver.get(Constants.PageURL.ZEPO_HOME);
		
		logger = report.startTest(className + "Verify that Store Set up wizard Opens correctly by Filling Form in footer ");
		logger.log(LogStatus.INFO, "Redirecting To Zepo Home Page");
		// Handling WebEngage Popup
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));

			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch (Exception e) {
		}

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/section[9]/div/h3")));
		actions.perform();
		logger.log(LogStatus.PASS, "Scroll down to locate Sign-Up Form in the Footer");

		driver.findElement(homePage.nameField_Footer).sendKeys(name);
		driver.findElement(homePage.emailField_Footer).sendKeys(email);
		driver.findElement(homePage.passwordField_Footer).sendKeys(password);
		logger.log(LogStatus.INFO, "Sign-Up Form filled");
		
		WebElement startSellingNowButton_Footer = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePage.startSellingNowButton_Footer));
		startSellingNowButton_Footer.click();
		logger.log(LogStatus.INFO, "Start Selling Now Button in Footer Clicked");

		try {
			@SuppressWarnings("unused")
			WebElement doneNextButton_storesetup = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(homePage.doneNextButton_storesetup));

		} catch (Exception e) {
		}

		Assert.assertTrue(homePage.existsElement(homePage.doneNextButton_storesetup), "Store Set up Button Not Found");
		logger.log(LogStatus.PASS, "Store Setup wizard opened Correctly");
	}
}
