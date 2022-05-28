package testNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerManagerEx1 {
	@BeforeClass
	public void getCusomerTestData() {
		  System.out.println("getCusomerTestData");
	  }
	
	 @Test
	  public void createCust() {
		  System.out.println("CreateCustomer");
	  }
	  @Test
	  public void updateCust() {
		  System.out.println("UpdateCustomer");
	  }
	  @Test
	  public void deleteCust() {
		  System.out.println("DeleteCustomer");
	  }
	  @AfterClass
		public void flushCusomerTestDataObjects() {
			  System.out.println("flushCusomerTestDataObjects");
		  }
  
}
