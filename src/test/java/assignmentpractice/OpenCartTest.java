package assignmentpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	@Test
	public void getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Your Store");
	}
	@Test
	public void searchTest() {
		WebElement srch = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		boolean flag = srch.isDisplayed();
		Assert.assertTrue(flag, "Search Field is not present on the webpage");
	}
	@Test
	public void currencyDropDown() {
		WebElement dropdown = driver.findElement(By.xpath("//button[@data-toggle='dropdown']//span[contains(text(),'Currency')]"));
		boolean flag = dropdown.isDisplayed();
		Assert.assertTrue(flag, "Dropdown is not present on the webpage");
	}
}
