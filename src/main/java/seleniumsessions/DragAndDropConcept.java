package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement tgtElement = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(srcElement).moveToElement(tgtElement).release().build().perform();
		
		//We cannot write build only without perform 
		//We can write perform without build 
		//Because perform will do the build and perform the actions
		
		driver.navigate().refresh();
		
		srcElement = driver.findElement(By.id("draggable"));
		tgtElement = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(srcElement, tgtElement).build().perform();
		
		
		
		
		
		

}
}
