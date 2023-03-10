package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practiceopencart {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	public void searchProduct(String productName, String productlink) {
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(productName);
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		driver.findElement(By.linkText(productlink)).click();
		
		String product = driver.findElement(By.xpath("//h1[text()='"+productlink+"']")).getText();
		System.out.println(product);
	}
	@Test(dataProvider = "searchData")
	public void srchProduct(String productName, String productlink) {
		searchProduct(productName, productlink);
	}
	@DataProvider
	public Object[][] searchData(){
		
		return new Object[][] {
			{"macbook","MacBook Air"},
			{"samsung","Samsung Galaxy Tab 10.1"},
		};
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
