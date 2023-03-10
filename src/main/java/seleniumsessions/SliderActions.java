package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://signature-generator.com/draw-signature/");
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement slider = driver.findElement(By.id("slider"));
		slider.click();
		
		int width = slider.getSize().getWidth();
		System.out.println(width);//1020
		
		int height = slider.getSize().getHeight();
		System.out.println(height);//14
		
		Actions act = new Actions(driver);
		//act.moveToElement(slider, -((width/2)-20), 0).click().build().perform();
		act.clickAndHold(slider).moveByOffset((width/2-40), 0).click().build().perform();
		
		
		
				
	}

}
