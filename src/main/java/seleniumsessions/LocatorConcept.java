package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		//create a webElement + perform some action (click,sendKeys,getText,isDisplayed)
		//To create a webElement : need a locator 
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1st approach
		//driver.findElement(By.id("input-email")).sendKeys("gowtham");
		//driver.findElement(By.id("input-password")).sendKeys("password");
		
		//2nd approach
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailID.sendKeys("gowtham@gmail.com");
//		password.sendKeys("password@123");
		
//		//3rd approach By locator directly 
//		By Username = By.id("input-email");
//		By Password = By.id("input-password");
//		//By locator will not create the web element here, we need to use find element
//		
//		WebElement eid = driver.findElement(Username);
//		WebElement pwd = driver.findElement(Password);
//		
//		eid.sendKeys("gowtham@gmail.com");
//		pwd.sendKeys("password@123");
		
		//4th approach: By locator approach + generic method for WebElement
//		By Username = By.id("input-email");
//		By Password = By.id("input-password");
//		getElement(Username).sendKeys("gowtham@gmail.com");
//		getElement(Password).sendKeys("gowtham@123");
		
		//5th approach: By locator + generic methods for WebElement and actions
//		By Username = By.id("input-email");
//		By Password = By.id("input-password");
//		doSendKeys(Username, "gowtham@gmail.com");
//		doSendKeys(Password, "password@123");
		
		//6th approach: By locator + generic methods for WebElement and actions in a ElementUtil Class
		By Username = By.id("input-email");
		By Password = By.id("input-password");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(Username, "gowtham@gmail.com");
		eu.doSendKeys(Password, "Password@123");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); 	
	}
	//To avoid writing send keys multiple times we are using the 5th approach
	//First it is creating the web element and doing some action for the webelement
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	

}
