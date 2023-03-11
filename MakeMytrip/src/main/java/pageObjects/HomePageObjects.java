package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	WebDriver driver;
	
	
		@FindBy(xpath="//img[@alt='Make My Trip']")
		private WebElement logo;	
		
		@FindBy(xpath="//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")
		private WebElement loginBtn;		
		
		@FindBy(xpath="//span[@class='switcherDownArrow appendLeft10']")
		private WebElement langBtn;
				
		@FindBy(xpath="//a[@class='makeFlex hrtlCenter column active']")
		private WebElement flightbutton;
		
		@FindBy (xpath="//a[text()='Search']")
		private WebElement searchButton;
		
		@FindBy (xpath="//div[@id='Offers_Listing']")
		private WebElement offersBlock;
		
		public HomePageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
	
		public boolean isLogoPresent() {
			return logo.isDisplayed();
		}
		public void logoClick() {
			logo.click();
		}
		public boolean isLoginButtonPresent() {
			return loginBtn.isDisplayed();			
		}
		public void loginBtnClick() {
			loginBtn.click();
		}
		public void langSelect() {
			langBtn.click();
		}
		public boolean flightButtonOption() {
			return flightbutton.isDisplayed();
		}
		public void flightButtonClick() {
			flightbutton.click();
		}
		public boolean isoffersBlockPresent() {
			return offersBlock.isDisplayed();
		}
		public void offersBlockClick() {
			offersBlock.click();
		}
		
}
