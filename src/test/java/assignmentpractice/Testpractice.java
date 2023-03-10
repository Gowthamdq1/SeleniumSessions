package assignmentpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testpractice {

	WebDriver driver;
	
	By country = By.id("input-country");

	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
	}
	@DataProvider
	public Object[][] regTestData() {
		return new Object[][] {
			{"GowthamSivaji","Gowtham","Sivaji","gowtham@gmail.com","test@123"},
		};
	}
	@DataProvider
	public Object[][] countryData(){
		return new Object[][] {
			{"India"},
		};
	}
	public void selectCountry(String Country) {
		Select s = new Select(driver.findElement(country));
		s.selectByVisibleText(Country);
	}
	public void doRegistration(String un, String fn, String ln,String email,String password) {
		driver.findElement(By.id("input-username")).sendKeys(un);
		driver.findElement(By.id("input-firstname")).sendKeys(un);
		driver.findElement(By.id("input-lastname")).sendKeys(un);
		driver.findElement(By.id("input-email")).sendKeys(un);
		driver.findElement(By.id("input-country")).sendKeys(un);
		driver.findElement(By.id("input-password")).sendKeys(un);
	}
	@Test(dataProvider = "regTestData")
	public void doReg(String un, String fn, String ln,String email,String password) {
		doRegistration(un, fn, ln, email,password);
	}
	@Test(dataProvider = "countryData")
	public void selCountry(String Country) {
		selectCountry(Country);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
