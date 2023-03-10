package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {
	
	public static void main(String[] args) {
		String browserName = "chrome";
		
		BrowserUtil brwutil = new BrowserUtil();
		WebDriver driver = brwutil.initiDriver(browserName);
		brwutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brwutil.getPageTitle();
		System.out.println(title);
		
		//By locators
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "gowtham");
		eleUtil.doSendKeys(lastName, "s");
		eleUtil.doSendKeys(email, "gowtham@gmail.com");
		eleUtil.doSendKeys(telephone, "9876543210");
		eleUtil.doSendKeys(password, "password@123");
		eleUtil.doSendKeys(confirm, "password@123");
		
		brwutil.quitBrowser();
		
		
	}

}
