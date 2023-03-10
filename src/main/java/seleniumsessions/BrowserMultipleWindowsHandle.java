package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowID = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement linkEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		twEle.click();
		fbEle.click();
		ytEle.click();
		linkEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		//This will loop until the condition is true
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			if(!windowID.equals(parentWindowID)) {
				driver.close();
			}}
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());

}}
