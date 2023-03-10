package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	//global pre conditions
	//pre condition
	//test cases --> test steps --> act vs exp result --> assertions
	//post steps
	//post global steps
	
//	BS--Start DB Connection
//	BT--create User
//	BC--Launch Browser
//	BM--login to app
//	homePageSearchTest
//	AM--logout
//	BM--login to app
//	homePageTitleTest
//	AM--logout
//	BM--login to app
//	homePageURLTest
//	AM--logout
//	AC--close browser
//	AT--delete user
//	AS--disconnectWithDB

	//1
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS--Start DB Connection");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT--create User");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--Launch Browser");
	}
	//4 7 10 
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM--login to app");
	}
	//5
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	//8
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}
	//11
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	//6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--close browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--delete user");
	}
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS--disconnectWithDB");
	}
	
	
}

