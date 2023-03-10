package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopup {
	public static void main(String[] args) throws InterruptedException {
		//Javascript alert popup 
		//We cannot have two input fields in the prompt alert 
		//It is not part of the browser
		//js alert - alert, prompt, confirm
		//auth pop up
		// browser window pop up / adv pop up 
		// file upload pop up 
		//alerts are not part of DOM
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		//NoAlertPresentException -- Incase of no alert is present in webpage
//		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();
// 		alert.dismiss();
		
		//Confirm Alert
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//      alert.accept();//Click on OK
		//alert.dismiss();//Click on Cancel
		
		//Prompt Alert:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Gowtham");
		Thread.sleep(3000);
		alert.accept();
		
		
		
		
	}

}
