package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Utility {
		static WebDriver driver;	
			
		public static WebDriver launchBrowser(String url, String browser ) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\hp\\OneDrive\\Documents\\Automation\\chromedriver.exe");
				 driver = new ChromeDriver();
				
				}else if(browser.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.chrome.driver", 
							"C:\\Users\\hp\\OneDrive\\Documents\\Automation\\msedgedriver.exe");
					driver = new EdgeDriver();	
					
				}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			return driver;
		}
}
