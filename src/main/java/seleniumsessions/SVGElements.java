package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		
		//SVG - scalar vector graph
		//For SVG the normal xpath will not work 
		//We need to use local-name to identify SVG
		//local-name will only work for SVG not for others
		
		//*[local-name()='svg' and @id='map-svg']
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains (@id,'map-instance')]")));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());
		
		for(WebElement e : statesList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
			
			if(stateName.equals("California")) {
				e.click();
				break;
			}
		}
		
		
		
		
		
		
	}
	
}
