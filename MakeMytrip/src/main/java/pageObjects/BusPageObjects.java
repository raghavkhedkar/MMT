package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusPageObjects {
	WebDriver driver;		
		@FindBy (xpath="//input[@id='fromCity']")
		private WebElement fromCity;
		
		@FindBy (xpath="//input[@id='toCity']")
		private WebElement toCity;
		
		@FindBy (xpath="//input[@placeholder='From']")
		private WebElement fromCityInputField;
		
		@FindBy (xpath="//input[@placeholder='To']")
		private WebElement toCityInputField;
		
		@FindBy (xpath="//a[@class='pointer']")
		private WebElement travelWithGroupText;
		
		public BusPageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public boolean isFromCityOptionVisible(){
			return fromCity.isDisplayed();
		}
		public void clickOnFromCityOption() {
			fromCity.click();
		}
		public boolean isToCityOptionVisible() {
			return toCity.isDisplayed();
		}
		public void clickOnToCityOption() {
			toCity.click();
		}
		public void enterValueFromCityInputField(String source) {
			fromCityInputField.sendKeys(source);
		}
		public boolean isTravelWithGroupVisible() {
			return travelWithGroupText.isDisplayed();
		}
		public void travelWithGroupTextLinkClick() {
			travelWithGroupText.click();
		}
	
}
