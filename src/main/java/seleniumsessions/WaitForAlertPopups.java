package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertPopups {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//The above condition will not return WebElement since based on the condition used it will return
		// It will switch to alert also 
		}
	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return  wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeOut) {
		return waitForAlertPresence(timeOut).getText();
	}
	public static void acceptAlert(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}
	public static void dismissAlert(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}
	public static void alertSendKeys(int timeOut, String Value) {
		waitForAlertPresence(timeOut).sendKeys(Value);
	}
	
}
