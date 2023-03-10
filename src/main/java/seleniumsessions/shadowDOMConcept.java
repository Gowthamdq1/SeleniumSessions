package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDOMConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Shadow root should be open and it should not be closed 
		// If it is open we cannot automate it 
		// Shadow DOM's are used for security purposes
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		//driver.findElement(By.id("pizza")).sendKeys("veg Pizza");
		
		//browser -- page -- shadowDOM -- shadow DOM -- input element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pizza = (WebElement)js.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		
		pizza.sendKeys("veg pizza");
		
		
		
		
		
		
	}

}
