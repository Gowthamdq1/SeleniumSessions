package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfoTable {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/south-africa-women-s-t20i-tri-series-2022-23-1344500/south-africa-women-vs-west-indies-women-4th-match-1344514/full-scorecard");
		Thread.sleep(4000);
		
		String wkName = getWicketTakerName("Britney Cooper");
		System.out.println(wkName);
		
		wkName = getWicketTakerName("Rashada Williams");
		System.out.println(wkName);
	
		List<String>williamsScoreList = getScoreCardList("Rashada Williams");
		System.out.println(williamsScoreList);
	}
	
	public static String getWicketTakerName(String batsmanName) {
	return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span")).getText();
	}
	public static List<String> getScoreCardList(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> playerScoreList = new ArrayList<String>();
		
		for(WebElement e : scoreList) {
			String text = e.getText();
			playerScoreList.add(text);
		}
		return playerScoreList;
	}
	
}
