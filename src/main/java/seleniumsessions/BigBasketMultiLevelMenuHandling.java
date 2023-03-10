package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		By L1Cat = By.cssSelector("a.meganav-shop");
		selectProductLevel4Handling(L1Cat,"Snacks & Branded Foods", "Snacks & Namkeen", "Chips & Corn Snacks");
}	
	public static void selectProductLevel4Handling(By L1Cat, String L2,String L3,String L4) throws InterruptedException {
		WebElement shopParentEle = driver.findElement(L1Cat);
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
		
		WebElement L2ele = driver.findElement(By.linkText(L2));
		act.moveToElement(L2ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L3ele = driver.findElement(By.linkText(L3));
		act.moveToElement(L3ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L4ele = driver.findElement(By.linkText(L4));
		L4ele.click();
	}
}
