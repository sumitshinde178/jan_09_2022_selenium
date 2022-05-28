package testNgEx2; 

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManagerEx1 {
	@BeforeClass
	public void getAccountTestData() {
		  System.out.println("getAccountTestData");
	  }
	
	 @Test
	  public void createAccount() {
		  System.out.println("CreateAccount");
	  }
	  @Test
	  public void updateAccount() {
		  System.out.println("UpdateAccount");
	  }
	  @Test
	  public void deleteAccount() {
		  System.out.println("DeleteAccount");
	  }
	  @AfterClass
		public void flushAccountTestDataObjects() {
			  System.out.println("flushAccountTestDataObjects");
		  }
}
