package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		//Find all links on the page
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		//print total links count
		int linksCount = linksList.size();
		System.out.println("Total Links count : "+linksCount);
		
		//print the text of each link
		//If we use = in the second condition it will throw IOE
		//Always the DOM will be loaded first before page opens
		//Some blank links are available that's y some texts are blank
		//We are printing the text of link which is having the value
//		for(int i=0;i<linksCount;i++) {
//			String text = linksList.get(i).getText();	
//			if(text.length()>0) {
//				System.out.println(i+" : "+text);
//			}
//		}
		//for each:
		int count=0;
		for(WebElement e : linksList) {
			String text = e.getText();
			if(text.length()>0) {
			System.out.println(count + "  : "+ text);
		}
			count++;
	}
}}
