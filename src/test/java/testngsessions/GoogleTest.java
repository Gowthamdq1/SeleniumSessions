package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	//Test cases should be independent
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	@Test(priority=2)
	public void searchExistTest() {
	boolean flag = driver.findElement(By.name("q11")).isDisplayed();
	Assert.assertTrue(flag);
	}

}
