package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
//		List<WebElement> linksList = getElements(links);
//		System.out.println("Total Links ======>"+linksList.size());
//		
//		for(WebElement e : linksList) {
//			String href = e.getAttribute("href");
//			String linksText = e.getText();
//			System.out.println(href+" ---> "+linksText);
//		}
//		List<WebElement> imagesList = getElements(images);
//		System.out.println("Total images ======>"+imagesList.size());
//		
//		for(WebElement e : imagesList) {
//			String srcVal = e.getAttribute("src");
//			System.out.println(srcVal);
//		}
		
		getElementAttributes(images, "src");
		getElementAttributes(links, "href");
		
	}
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	public static void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);
		}
	}
	

}
