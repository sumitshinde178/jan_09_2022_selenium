package testNgEx1;

import org.testng.annotations.Test;
//EXECUTION As Per ASCII VALUE
public class PriorityEx6 {
  @Test(priority = 6)
  public void loginCustomer() {
	  System.out.println("LoginCustomer");
	  }
  @Test(priority = 5)
  public void logoutCustomer() {
	  System.out.println("LogoutCustomer");
  }
  @Test(priority = 1)
  public void createCustomer() {
	  System.out.println("small - createCustomer");
	   }
  @Test(priority = 1)
  public void CreateCustomer() {
	  System.out.println("Capital - createCustomer");
  }
  @Test(priority = -6)
  public void updateCustomer() {
	  System.out.println("small - updateCustomer");
  }
  @Test(priority = 0)
  public void UpdateCustomer() {
	  System.out.println("Capital - UpdateCustomer");
  }
}
