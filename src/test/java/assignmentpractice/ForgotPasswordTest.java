package assignmentpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
	
	@Test
	public void fgtPswd() {
		String text = driver.findElement(By.xpath("//h1[text()='Forgot Your Password?']")).getText();
		Assert.assertEquals(text, "Forgot Your Password?");
	}
	@Test
	public void getPageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Forgot Your Password?");
	}
	@Test
	public void searchTest() {
		WebElement srch = driver.findElement(By.id("input-email"));
		boolean flag = srch.isDisplayed();
		Assert.assertTrue(flag, "Email Field is not present on the webpage");
	}
	}
