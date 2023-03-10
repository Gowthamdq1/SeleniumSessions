package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		
		email.sendKeys("Gowtham");//DOM V1
		
		driver.navigate().refresh();//DOM V2
		
		email = driver.findElement(By.id("input-email"));
		
		email.sendKeys("makee");
		
		//To avoid stale element ref exception we should not refresh the page unless it is required
		
		
		
	
	}

}
