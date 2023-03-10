package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {
	
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();

		//To run in incognito mode
		co.addArguments("--incognito");
		
		//co.setHeadless(true);
		//If true headless / If false normal execution will be done
		
		//Another way to run in headless mode 
		//co.addArguments("--headless");
		
		//Use cases
		//sanity cases
		//for the complex html dom - it might not work 
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
