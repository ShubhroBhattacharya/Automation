package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.ZepoHomePageMenu;
import com.base.ZepoHomePageSetup;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ZepoHomePageMenuTests extends ZepoHomePageSetup {
	
	private WebDriver driver;
	private ExtentReports report;
	private ExtentTest logger;
	private String className = "ZEPO | HomePageSliderMenuTests | ";
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		report = getReport();
		logger = getLogger();
	}
	
	
	/**
	 * Opens up the Slider Menu
	 */
	@Test(priority = 0)
	public void openSliderMenu() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu Open/Close ");
		//used to handle webengage pop-up
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));
			
			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch(Exception e){}
		
		
		WebElement menuSliderButton = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.menuSliderButton));
		System.out.println("Opening the Menu Slider in Zepo Home Page");
		menuSliderButton.click();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		Assert.assertTrue(homePageMenu.existsCloseToggleMenuButton(), "Close Button not found");
		logger.log(LogStatus.INFO, "Close Button Detected in Slider");
		
		WebElement closeToggleMenuButton = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.closeToggleMenuButton));
		closeToggleMenuButton.click();
		logger.log(LogStatus.PASS, "Close Button Clicked to close Slider");
	}
	
	
	@Test(priority = 1)
	public void clickOnSellOnMarketPlaces() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - sellOnMarketPlaces");
		// used to handle web engage pop-up
		try {
			WebElement webengageCancel = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));
			
			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch(Exception e){}
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement sellOnMarketPlaces = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.sellOnMarketPlaces));
		System.out.println("Clicking on sellOnMarketPlaces in the Menu Slider in Zepo Home Page");
		sellOnMarketPlaces.click();
		logger.log(LogStatus.PASS, "sellOnMarketPlaces Clicked");
		
		System.out.println("Zepo Sell on Marketplaces Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("sellOnMarketPlaces"), "Sell On market Places page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | sellOnMarketPlaces Page Redirected Correctly");
	}
	
	@Test(priority = 2)
	public void clickOnFacebookStore() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - facebookStore");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement facebookStore = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.facebookStore));
		System.out.println("Clicking on facebookStore in the Menu Slider in Zepo Home Page");
		facebookStore.click();
		logger.log(LogStatus.PASS, "facebookStore Clicked");
		
		/*try {
			WebElement webengageCancel = (new WebDriverWait(driver, 5))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"survey-close-div\"]/i")));
			
			webengageCancel.click();
			System.out.println("Webengage Element Found");
		} catch(Exception e){}*/
		
		System.out.println("Zepo Facebook store Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("facebookStore"), "Facebook Store page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | facebookStore Page Redirected Correctly");
	}
	
	@Test(priority = 3)
	public void clickOnAutomatedAdvertising() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - automatedAdvertising");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement automatedAdvertising = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.automatedAdvertising));
		System.out.println("Clicking on automated Advertising in the Menu Slider in Zepo Home Page");
		automatedAdvertising.click();
		logger.log(LogStatus.PASS, "automatedAdvertising Clicked");
		
		System.out.println("Zepo Automated Advertising Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("automatedAdvertising"), "Automated Advertising Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | automatedAdvertising Page Redirected Correctly");
	}
	
	@Test(priority = 4)
	public void clickOnThemeCustomizationService() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - themeCustomizationService");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement themeCustomizationService = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.themeCustomizationService));
		System.out.println("Clicking on theme Customization service in the Menu Slider in Zepo Home Page");
		themeCustomizationService.click();
		logger.log(LogStatus.PASS, "themeCustomizationService Clicked");
		
		System.out.println("Zepo themeCustomizationService Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("themeCustomizationService"), "ThemeCustomizationService Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | themeCustomizationService Page Redirected Correctly");
	}
	
	@Test(priority = 5)
	public void clickOnFeatures() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - features");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement features = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.features));
		System.out.println("Clicking on features in the Menu Slider in Zepo Home Page");
		features.click();
		logger.log(LogStatus.PASS, "features Clicked");
		
		System.out.println("Zepo Features Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("features"), "Features Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | Features Page Redirected Correctly");
	}
	
	@Test(priority = 6)
	public void clickOnThemes() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - themes");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement themes = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.themes));
		System.out.println("Clicking on themes in the Menu Slider in Zepo Home Page");
		themes.click();
		logger.log(LogStatus.PASS, "themes Clicked");
		
		System.out.println("Zepo themes Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("themes"), "themes Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | themes Page Redirected Correctly");
	}
	
	@Test(priority = 7)
	public void clickOnAndroidIosApp() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - androidIosApp");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement androidIosApp = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.androidIosApp));
		System.out.println("Clicking on androidIosApp in the Menu Slider in Zepo Home Page");
		androidIosApp.click();
		logger.log(LogStatus.PASS, "androidIosApp Clicked");
		
		System.out.println("Zepo androidIosApp Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("androidIosApp"), "androidIosApp Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | androidIosApp Page Redirected Correctly");
	}
	
	@Test(priority = 8)
	public void clickOnTheTeam() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - theTeam");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement theTeam = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.theTeam));
		System.out.println("Clicking on theTeam in the Menu Slider in Zepo Home Page");
		theTeam.click();
		logger.log(LogStatus.PASS, "theTeam Clicked");
		
		System.out.println("Zepo theTeam Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("theTeam"), "theTeam Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | theTeam Page Redirected Correctly");
	}
	
	@Test(priority = 9)
	public void clickOnCareers() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - careers");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement careers = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.careers));
		System.out.println("Clicking on careers in the Menu Slider in Zepo Home Page");
		careers.click();
		logger.log(LogStatus.PASS, "careers Clicked");
		
		System.out.println("Zepo careers Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("careers"), "careers Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | careers Page Redirected Correctly");
	}
	
	@Test(priority = 10)
	public void clickOnGetInTouch() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - getInTouch");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement getInTouch = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.getInTouch));
		System.out.println("Clicking on getInTouch in the Menu Slider in Zepo Home Page");
		getInTouch.click();
		logger.log(LogStatus.PASS, "getInTouch Clicked");
		
		System.out.println("Zepo getInTouch Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("getInTouch"), "getInTouch Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | getInTouch Page Redirected Correctly");
	}
	
	@Test(priority = 11)
	public void clickOnPartnerWithUs() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - partnerWithUs");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement partnerWithUs = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.partnerWithUs));
		System.out.println("Clicking on partnerWithUs in the Menu Slider in Zepo Home Page");
		partnerWithUs.click();
		logger.log(LogStatus.PASS, "partnerWithUs Clicked");
		
		System.out.println("Zepo partnerWithUs Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("partnerWithUs"), "partnerWithUs Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | partnerWithUs Page Redirected Correctly");
	}
	
	
	@Test(priority = 12, enabled = false)
	public void clickOnZepoBlogForSMB() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		homePageMenu.clickOnMenuButton();
		String windowHandle = driver.getWindowHandle();
		
		WebElement zepoBlogForSMB = (new WebDriverWait(driver, 20))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.zepoBlogForSMB));
		System.out.println("Clicking on zepoBlogForSMB in the Menu Slider in Zepo Home Page");
		zepoBlogForSMB.click();
		
		
		System.out.println("Zepo zepoBlogForSMB Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("zepoBlogForSMB"), "zepoBlogForSMB Page title does not match");
		driver.switchTo().window(windowHandle);
	}
	
	
	@Test(priority = 13)
	public void clickOnEBook() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - eBook");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement eBook = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.eBook));
		System.out.println("Clicking on eBook in the Menu Slider in Zepo Home Page");
		eBook.click();
		logger.log(LogStatus.PASS, "eBook Clicked");
		
		System.out.println("Zepo eBook Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("eBook"), "eBook Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | eBook Page Redirected Correctly");
	}
	
	@Test(priority = 14)
	public void clickZepoVsKartRocketShopify() {
				
		ZepoHomePageMenu homePageMenu = new ZepoHomePageMenu(driver);
		logger = report.startTest(className + "Verify Zepo Slider Menu - zepoVsShopify/Kartrocket");
		
		homePageMenu.clickOnMenuButton();
		logger.log(LogStatus.PASS, "Menu Button Clicked to Open Slider");
		
		WebElement zepoVsShopifyKartrocket = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(homePageMenu.zepoVsShopifyKartrocket));
		System.out.println("Clicking on zepoVsShopifyKartrocket in the Menu Slider in Zepo Home Page");
		zepoVsShopifyKartrocket.click();
		logger.log(LogStatus.PASS, "zepoVsShopify/Kartrocket Clicked");
		
		System.out.println("Zepo zepoVsShopifyKartrocket Page | Verifying Page Title");
		Assert.assertTrue(homePageMenu.verifyPageTitle("zepoVsShopifyKartrocket"), "zepoVsShopifyKartrocket Page title does not match");
		logger.log(LogStatus.PASS, "ZEPO | zepoVsShopify Page Redirected Correctly");
	}
	
	
	
}

