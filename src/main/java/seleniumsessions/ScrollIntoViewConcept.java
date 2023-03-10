package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewConcept {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Popular items this season']"));
		
		//js.scrollIntoView(ele);
		
		//click -- UI -- Click on middle of the element
		//actions click -- move to element -- click on middle of the element
		//JS click -- Based on DOM it will click not on the webpage
		
		WebElement registry = driver.findElement(By.linkText("Registry"));
		js.clickElementByJS(registry);
		

}

}
