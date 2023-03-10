package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//Find all images on the page
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//In case of List of webelements it will not throw any exception result in list as 0
		List<WebElement> imagesList = driver.findElements(By.tagName("img111"));
		System.out.println(imagesList.size());
		
		//FE vs FEs
		//WE    List<WebElement>
		//NSE   empty list=> size=0
		//action   no action
		
		//selenium always interacts with web page and not DOM
		//
		
		
	}		

}
