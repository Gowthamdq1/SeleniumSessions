package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	
	public static void main(String[] args) {
		//windows:
		//System.setProperty("webdriver.chrome.driver","path");
		
		WebDriver driver = new ChromeDriver();
		
		//4.5.3
		//Exception in thread "main" java.lang.IllegalStateException:
		//The path to the driver executable must be set by the webdriver.chrome.driver
		
		//106 -- .exe 106
		//107 -- .exe 107
		//108 -- .exe 108
		
		//We will take care of the binary management
		//Selenium manager - 4.6.0
		//WebDriver manager - Boni garcia
		
		//WebDriver manager is now known as Selenium manager
		//This will automatically check the current browser version and download the respective .exe file
		
		
	}

}
