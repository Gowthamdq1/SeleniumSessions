package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practice {
	public WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	public boolean doRegTest(String fn, String ln, String email, String mobNo, String password) {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(mobNo);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue' and @type='submit']")).click();
		
		String success_text = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		System.out.println(success_text);
		
		if(success_text.contains("Your Account Has Been Created!")) {
			return true;
		}
		return false;
	}
	public void doLogOut() {
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@DataProvider
	public Object[][] getRegTestData() {

		return new Object[][] { { "Gowtham", "Sivaji", "gowtham.s@gmail.com", "9876543210", "gowtham@123" },
                { "Makee", "s", "makee.s@gmail.com", "9876543210", "makee@123" },
                { "Test", "t", "Test.s@gmail.com", "9876543210", "Test@123" }, 
			};
	}
	@Test(dataProvider = "getRegTestData")
	public void registerTest(String fn, String ln, String email, String mobNo, String password) {
		doRegTest(fn, ln, email, mobNo, password);
		doLogOut();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
