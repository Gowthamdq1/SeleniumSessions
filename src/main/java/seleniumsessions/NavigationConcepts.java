package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		//Here we pass the URL using URL class and add throws declaration 
		driver.navigate().to(new URL("https://www.amazon.com/"));
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		//It is used to refresh the page 
	}

}
