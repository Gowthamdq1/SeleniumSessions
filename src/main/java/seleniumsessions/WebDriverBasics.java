package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		
		//open browser : ch, ff
		//For every browser we have a driver class
		//ChromeDriver driver = new ChromeDriver();
		
		String browser = "chrome";
		WebDriver driver  = null;
		
		//Cross browser logic
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Pls pass the right browser : "+browser);
		}

		//enter url
		//driver.get("www.google.com");
		//InvalidArgumentException
		//Protocol http is important
		
		//enter url
		driver.get("https://google.com");
		
		//get title
		String actualTitle = driver.getTitle();
		System.out.println("Page Title : "+actualTitle);
		
		//validation point / Checkpoint
		if(actualTitle.equals("Google")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//Automation steps + validation/assertions =  automation testing 
		
		driver.quit();//close the browser
		
		
		
	}
	

}
