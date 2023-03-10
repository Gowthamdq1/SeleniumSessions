package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	// We can write exact exception name or Exception / Throwable
	@Test(expectedExceptions = NullPointerException.class)
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9/0;
		System.out.println(i);
	}
	
}
