package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size()-1);
//		
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Brazil")) {
//				e.click();
//				break;	
//			}
//		}
		By country = By.id("Form_getForm_Country");
//		if(getTotalDropdownOptions(country)-1==232) {
//			System.out.println("Country drop down is correct");
//		}
//		if(getDropdownOptionsTextList(country).contains("India")) {
//			System.out.println("India is present in dropdown");
//		}
//		List<String> expCountryList = Arrays.asList("India","Belgium","Brazil");
//		//contains for the single country 
//		//containsAll for the multiple countries 
//		if(getDropdownOptionsTextList(country).containsAll(expCountryList)) {
//		System.out.println("PASS");	
//		}
		selectDropdownValue(country, "North Korea");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropdownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	public static List<String> getDropdownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropdownOptionsList(locator);
		List<String> optionsTextsList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextsList.add(text);
		}
		return optionsTextsList;
	}
	public static void selectDropdownValue(By locator,String expValue) {
		List<WebElement>optionsList = getDropdownOptionsList(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(expValue)) {
				e.click();
				break;
			}}}
	public static int getTotalDropdownOptions(By locator) {
		int optionsCount = getDropdownOptionsList(locator).size();
		System.out.println("Total Options =========> "+optionsCount);
		return optionsCount;
		}
}
