package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {
	
static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//By will not hit the server , when it moves to driver.findElement it will throw exception
		//Always read the exception from the bottom
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		
		//we + action
		boolean flagImg = driver.findElement(logoImage).isDisplayed();
		System.out.println(flagImg);
		//Throw -- NoSuchElementException
		

	}}
