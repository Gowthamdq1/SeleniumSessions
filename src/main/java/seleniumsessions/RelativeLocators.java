package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		//above
		//near
		//left . right
		//below
		
		//selenium 4.x
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.linkText("Lancienne Lorette, Canada"));
		
		//with methods from class relative locator class
		
		/**
		 * start of a relative locator, finding elements by tag name.
		 */
		
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		//Within 100 pixels range it will find the nearest element
		String nearCity = driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(nearCity);
		
		
		
		
	}

}
