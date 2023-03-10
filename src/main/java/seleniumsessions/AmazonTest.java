package seleniumsessions;

public class AmazonTest {
	
	public static void main(String[] args) {
		String browserName="chrome";
		BrowserUtil brwUtil = new BrowserUtil();
		brwUtil.initiDriver(browserName);
		brwUtil.launchURL("https://www.amazon.com");
		String actTitle = brwUtil.getPageTitle();
		if(actTitle.contains("amazon")) {
			System.out.println("Title---pass");
		}
		else {
			System.out.println("Title---fail");
		}
		String actURL = brwUtil.getPageURL();
		if(actURL.contains("amazon")) {
			System.out.println("URL---pass");
		}
		else {
			System.out.println("URL---fail");
		}
		brwUtil.quitBrowser();
	}
}
