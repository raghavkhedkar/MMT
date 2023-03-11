package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BusPageObjects;
import utils.Utility;

public class BusPageFunctionalityTest {
	WebDriver driver;
	BusPageObjects busPageObjects;
	
		@Parameters({"myUrl", "myBrowser"})
		@BeforeTest
		void startApplication(String url, String browser) {
			driver = Utility.launchBrowser(url,browser);
			busPageObjects = new BusPageObjects(driver);
		}
		@Test(priority=1)
		void fromCityfunctionality() {
			if(busPageObjects.isFromCityOptionVisible()) {
				busPageObjects.clickOnFromCityOption();
				busPageObjects.enterValueFromCityInputField("Mumbai");
			}
		}
		@Test(priority=2)
		void hireABusLinkVerification() {
			boolean hireABusFlag = busPageObjects.isTravelWithGroupVisible();
			Assert.assertTrue(hireABusFlag, "Link is displaying");
			busPageObjects.travelWithGroupTextLinkClick();			
		}
		
		
		
}
