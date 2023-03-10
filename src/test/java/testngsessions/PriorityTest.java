package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	//By default execution is in alphabetic order
	//When test are having same priority then it will be executed based on alphabetic order
	// We can provide negative priority also 
	//Priority is an integer type
	//By default if priority is not mentioned it will be zero
	//Non priority will be executed first followed by priority
	@Test(priority=0)
	public void a_test() {
		System.out.println("a test");
	}
	@Test(priority=1)
	public void b_test() {
		System.out.println("b test");
	}
	@Test(priority=2)
	public void c_test() {
		System.out.println("c test");
	}
	@Test(priority=3)
	public void d_test() {
		System.out.println("d test");
	}
	@Test(priority=4)
	public void e_test() {
		System.out.println("e test");
	}
	

}
