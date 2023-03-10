package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	
	public static void main(String[] args) {

		//SID - SESSION ID
		WebDriver driver = new ChromeDriver();//123
		driver.get("https://www.google.com");//123
		
		String title = driver.getTitle();//123
		System.out.println("Page title : "+title);
		
		System.out.println(driver.getCurrentUrl());//123
		
		driver.quit();//123
		//driver.close();//123
		//This is having only the current window so the title will not be printed after it 
		
		System.out.println(driver.getTitle());//sid = null
		//NoSuchSessionException : Session ID is null. Using WebDriver after calling quit()?
		
		
	}

}
