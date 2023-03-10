package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	//Testng will support Object [][]
	public WebDriver driver;
	
	public boolean doLogin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if(errorMesg.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
		
	}
	@DataProvider
	public Object[][] getLoginNegativeData() {
		
		return new Object [][] {
			{"abcajflsad@gmail.com", "pass@123"},
			{"abc1234@gmail.com", "pass@1"},
			{"abc@gmail.com", "pass@212"},
			{"abksajdfhksad@gmail.com", "akfhksdf"},
		};
		
	}
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String username,String password) {
		boolean flag = doLogin(username, password);
		Assert.assertTrue(flag);
	}
	@DataProvider
	public Object[][] getRegTestData() {
		
		return new Object[][] {
			{"Gowtham","Sivaji","gowtham.s@gmail.com","9876543210","gowtham@123"},
			{"Makee","s","makee.s@gmail.com","9876543210","makee@123"},
			{"Test","t","Test.s@gmail.com","9876543210","Test@123"},
		};
	}
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String fn, String ln, String email, String mobNo, String password) {
		
	}
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}

