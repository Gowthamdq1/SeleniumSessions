package testngsessions;

import org.testng.annotations.Test;

public class TestDependency {
	//If any test is getting failed and which is a dependent test for another test
	//In that case it will be skipped
	@Test
	public void searchTest() {
		System.out.println("Search Test");
		int i =9/0;
	}
	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void makePayment() {
		System.out.println("makePayment");
	}

}
