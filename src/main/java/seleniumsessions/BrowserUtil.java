package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	//Declaring private so no one can create object of it outside of this class
	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browserName
	 * @param browserName
	 * @return This returns the specific browser driver
	 */
	public WebDriver initiDriver(String browserName) {
		System.out.println("Browser name is :"+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Pls pass the right browser input :"+browserName);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		//The type of driver is webdriver
	}
	//https://www.amazon.com
	public void launchURL(String url) {
		//Selenium doesn't handle null checks 
		if(url==null) {
			System.out.println("URL can not be null");
			
		}
		//Because the index of https index is 0 everytime
		//else if 
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title : "+title);
		return title;
	}
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("page current url : "+url);
		return url;
	}
	public void closeBrowser() {
		//If the driver is not equal to null then close the browser 
		if(driver!=null) {
			driver.close();
		}
	}
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
	
	
}
