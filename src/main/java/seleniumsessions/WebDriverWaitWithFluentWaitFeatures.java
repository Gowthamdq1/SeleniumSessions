package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentWaitFeatures {
	static WebDriver driver;
	public static void main(String[] args) {
		// WebDriverWait --> FluentWait ---> Wait
		 driver = new ChromeDriver();
		 driver.get("https://www.freshworks.com/");
		 By freeTrial = By.xpath("//a[@title='Free Trial']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofNanos(10));
//		wait.pollingEvery(Duration.ofSeconds(2));
//		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
//		wait.withMessage("Element not found");
//		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial));
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
	}

}
