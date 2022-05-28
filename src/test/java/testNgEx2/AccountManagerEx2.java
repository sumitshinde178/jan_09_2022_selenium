package testNgEx2; 

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManagerEx2 {
	@BeforeTest
	public void getDevEnvDetails2() {
		System.out.println("get DEV ENVIRONMENT DETAILS");
	}

	@Test
	public void createAccount2() {
		System.out.println("CreateAccount");
	}
	@Test
	public void updateAccount2() {
		System.out.println("UpdateAccount");
	}
	@Test
	public void deleteAccount2() {
		System.out.println("DeleteAccount");
	}
	@AfterTest
	public void flushAccountTestDataObjects2() {
		System.out.println("flushAccountTestDataObjects");
	}
}
