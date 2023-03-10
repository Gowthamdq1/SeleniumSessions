package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//sel 3x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// sel 4X
		
		//global wait: 10 secs
		//It will be applied for all the element by default
		//FE - imp wait will be applied automatically
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("input-email")).sendKeys("gowtham@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("gowtham");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// e4 -- 10
		// e5 -- 10 
		// e6 -- 10
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// global wait: 20 secs
		// e7 e8 e9 -- 20 secs
		
		//login page: 20 secs --> 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register: 5 secs :
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//login:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//forgot pwd: 0 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		// The problem with implicit wait is it will override when it is declared
		// It can be used only for webelement: SVG, Iframe, WEs
		
		// It doesn't support non-webelements: title, url, alert-js
		
		//Implicit wait will work for find element only and not find elements
		
		
		
		
		
		
	}

}
