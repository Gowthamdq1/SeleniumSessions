package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		//8 locators
		//id, name, classname, xpath, linktext,css selector, Partial Link Text, tag name..
		
		//create a webElement + perform some action (click,sendKeys,getText,isDisplayed)
		//To create a webElement : need a locator 
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id - unique and cannot be duplicate
		//driver.findElement(By.id("input-email")).sendKeys("gowtham");
		
		//2. name - Can be duplicate
		//driver.findElement(By.name("email")).sendKeys("gowtham@gmail.com");
		//By emailID = By.name("email");
		
		//3. class name - not an unique attribute and can be duplicate most of the time
		//Use class name only if it is unique
		//If the attribute is having common class elements the first element will be considered
		//driver.findElement(By.className("form-control")).sendKeys("gowtham@gmail.com");
		
		//4. xpath is not an attribute. It is the address of the element in HTML DOM
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gowtham@gmail.com");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("gowtham@gmail.com");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		By email = By.xpath("//input[@id='input-email']");
//		By password = By.xpath("//input[@id='input-password']");
//		By loginBtn = By.xpath("//input[@type='submit']");
//		
//		doSendKeys(email, "gowtham@gmail.com");
//		doSendKeys(password, "Password@123");
//		doClick(loginBtn);
		
		//5.css selector: not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("Password@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

		//6. linkText: It is applicable only for links anchor tagname
		//Link text can be duplicate
		//driver.findElement(By.linkText("Register")).click();
//		By registerLink = By.linkText("Register");
//		doClick(registerLink);
		
		//7. Partial Link Text: Only for links
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tagname: html tag
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		//Get text: Links, headers, Paragraphs, Footer, Header,Text of a specific element
		
		By payment = By.linkText("Recurring payments");
		
		String val = doGetText(payment);
		System.out.println(val);
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendKeys(By locator ,String value) {
		getElement(locator).sendKeys(value);
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
		
		

		
		
		
	
	

}
