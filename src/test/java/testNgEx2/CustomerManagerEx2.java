package testNgEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerManagerEx2 {
	@BeforeTest
	public void getQAEnvDetails2() {
		System.out.println("GET QA ENVIRONMENT DETAILS");
	}

	@Test
	public void createCust2() {
		System.out.println("CreateCustomer");
	}
	@Test
	public void updateCust2() {
		System.out.println("UpdateCustomer");
	}
	@Test
	public void deleteCust2() {
		System.out.println("DeleteCustomer");
	}
	@AfterTest
	public void flushCusomerTestDataObjects2() {
		System.out.println("flushCusomerTestDataObjects");
	}

}
