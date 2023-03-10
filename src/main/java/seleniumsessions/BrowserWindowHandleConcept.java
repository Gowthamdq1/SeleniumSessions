package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twEle.click();
		
		Set<String>handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window id : "+parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child window id : "+childWindowID);
		
		//switching to window
		driver.switchTo().window(childWindowID);
		System.out.println("child window url : "+driver.getCurrentUrl());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window url : "+driver.getCurrentUrl());
		driver.quit();
		
	}

}
