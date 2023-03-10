package seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
			
		Actions act = new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
		List<WebElement> rightElements = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
		for(WebElement e : rightElements) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				Alert at = driver.switchTo().alert();
				System.out.println(at.getText());
				at.accept();
				break;
			}
		}
		
}

}
