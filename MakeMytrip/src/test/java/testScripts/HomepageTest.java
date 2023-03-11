package testScripts;

import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.FileAssert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.HomePageObjects;
import utils.Utility;

public class HomepageTest {
	WebDriver driver;
	HomePageObjects homepageobjects;
	
	
	@Parameters({"myUrl", "myBrowser"})
	@BeforeClass	
	void startApplication(String url, String browser) {
		driver = Utility.launchBrowser(url, browser);
		homepageobjects = new HomePageObjects(driver);
	}
	
	    
	@Test(priority=1)
		void logoTest() {
			
			boolean logoFlag = homepageobjects.isLogoPresent();
			Assert.assertTrue(logoFlag,"Logo Verified");			
			}
	@Test(priority=2)
		void loginButtonVisible() {
			boolean loginFlag = homepageobjects.isLoginButtonPresent();
			Assert.assertTrue(loginFlag, "Login button present");
		}
	@Test(priority=3)
		void loginButtonTest() {
			   homepageobjects.loginBtnClick();
		}
		@Test(priority=4)
		void verifyOffersBlock() {
			boolean offersFlag = homepageobjects.isoffersBlockPresent();
			Assert.assertTrue(offersFlag, "offers displaying");
		}
	
	/*@AfterClass
	public void quitBrowser() {
		driver.quit();
	}*/
	
}
