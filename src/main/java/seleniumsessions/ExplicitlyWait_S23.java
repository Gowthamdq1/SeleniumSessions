package seleniumsessions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait_S23 {

    static WebDriver driver;
    public static void main(String[] args) {

    	driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
        
        By emailid = By.id("input-email");
        By psw = By.cssSelector("#input-password");
        By log = By.linkText("Login");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement email_ele =    wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
    
    //creating webElement 
    
    email_ele.sendKeys("hello ... how are you ");
        
    WebElement psw1 = getElement(psw);
            psw1.sendKeys("Kind@13");
    getElement(log).click();
    
    }
    
    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

}