package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowID = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);//Selenium 4x update
		
		driver.get("https://www.google.com");
		System.out.println("Child window title : "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title : "+driver.getTitle());
		
		//random pop up: cannot be handled
		// answer: This cannot be handled , Test environment QA we will block the pop up and it can be released in the production  
		

}

}
