package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// return is the javascript return and it will return the result of it
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"),'::before').getPropertyValue('content')";
		
		String mand_field = js.executeScript(script).toString();
		
		System.out.println(mand_field);
		
		if(mand_field.contains("*")) {
			System.out.println("This is a mandatory field");
		}
		
	
	}
	

}
