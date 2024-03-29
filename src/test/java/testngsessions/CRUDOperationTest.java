package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {
	// CRUD - Create , Retrieve , Update , Delete
	// Here we have written the tests without any dependency 
	// And it always run in seperate thread
	public void createUser() {
		System.out.println("create user");
	}
	public void getUser() {
		System.out.println("get user");
	}
	public void updateUser() {
		System.out.println("update user");
	}
	public void deleteUser() {
		System.out.println("delete user");
	}
	@Test
	public void createUserTest() {
		createUser();
	}
	@Test
	public void getUserTest() {
		createUser();
		getUser();
	}
	@Test
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
	}
	@Test
	public void deleteUserTest() {
		createUser();
		getUser();
		deleteUser();
		getUser();
	}
	
	
}
