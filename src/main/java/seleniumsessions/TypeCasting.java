package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TypeCasting {
	
	public static void main(String[] args) {
		//browser specific:
//		ChromeDriver ch = new ChromeDriver();
//		FirefoxDriver ff = new FirefoxDriver();
		
		//WD = new CD - Valid top casting - recommended
//		WebDriver driver = new ChromeDriver();
		
		//SearchContext =  new ChromeDriver(); - valid - not recommended
		//SearchContext sc = new ChromeDriver();
		
		//RWD = new CD - Valid top casting - recommended
		RemoteWebDriver d = new ChromeDriver();
		
		//WD = new RWD - valid top casting - recommended - GRID - Used for remote execution 
		//WebDriver dr = new RemoteWebDriver(remoteAddress, capabilities);
		
		//SC = new RWD - Valid but not recommended
		//SearchContext s = new RemoteWebDriver(URL, a);
		
		
		
		
		
		
		
		
		
		
	}

}
