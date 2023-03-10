package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//nested Iframes
		  // f1 -- ele
		      //f2 -- ele
		          //f3 -- ele
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("abc");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("PQR");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("abc--NEW");
		
		driver.switchTo().frame("pact2");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Hello");
		
		driver.switchTo().frame("pact2");
		driver.switchTo().frame("pact1");
		//driver.switchTo().defaultContent();//page and not frame
		driver.findElement(By.id("inp_val")).sendKeys("abc__updated");
		
		
		
		
		
	}

}
