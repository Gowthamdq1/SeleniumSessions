package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Naveen automation labs");
		
		Thread.sleep(3000);
		By googleSuggList = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		doSearch(googleSuggList, "naveen automation labs github");
	}
	
		public static void doSearch(By suggList,String suggName) {
		List<WebElement> suggListt = driver.findElements(suggList);
		System.out.println(suggListt.size());
		
		for(WebElement e : suggListt) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
}