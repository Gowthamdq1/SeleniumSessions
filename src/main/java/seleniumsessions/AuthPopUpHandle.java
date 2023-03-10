package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String password = "admin";
		
		//We are entering the username and password within the URL itself
		//If it is having password @ at the rate it will not accept because after @ domain name should be there 
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
	}

}
