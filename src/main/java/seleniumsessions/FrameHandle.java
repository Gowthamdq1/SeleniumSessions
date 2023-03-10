package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Frame is also a web element
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		int totalFrames = driver.findElements(By.xpath("//frame")).size();
		System.out.println(totalFrames);
		
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		//frame
		//iframe - with iframe dev can create n number of frames
		// Security of the web element
		
		
		
		
	}

}
