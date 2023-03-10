package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {
	//Test will run number of times based on the invocation count
	@Test(invocationCount = -10)
	public void createUserTest() {
		System.out.println("Create User");
	}

}
