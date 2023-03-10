package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		// Internally the script will be get called when executed 
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		js.executeScript("alert('hi this is alert');");
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		//jsUtil.generateAlert("This is my JS alert...We are on Amazon home page");
		//jsUtil.generateConfirmPopUp("Hello this is confirmation popup");
		
		//jsUtil.refreshBrowserByJS();
		
//		String paragraph =  jsUtil.getPageInnerText();
//		System.out.println(paragraph);
//		
//		if(paragraph.contains("Deal Pipeline")) System.out.println(true);
//		if(paragraph.contains("UNLIMITED CAMPAIGNS")) System.out.println(true);
		
		WebElement un = driver.findElement(By.name("username"));
//		jsUtil.drawBorder(un);
		
		jsUtil.flash(un);
		
		
		
		
		
		
		
	}

}
