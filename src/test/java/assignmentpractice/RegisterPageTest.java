package assignmentpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest{
	@Test
	public void getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Register Account");
	}
	@Test
	public void searchTest() {
		WebElement srch = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		boolean flag = srch.isDisplayed();
		Assert.assertTrue(flag, "Search Field is not present on the webpage");
	}
}
