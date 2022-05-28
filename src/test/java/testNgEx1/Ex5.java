package testNgEx1;

import org.testng.annotations.Test;
//EXECUTION As Per ASCII VALUE
public class Ex5 {
  @Test
  public void loginCustomer() {
	  System.out.println("LoginCustomer");
	  }
  @Test
  public void logoutCustomer() {
	  System.out.println("LogoutCustomer");
  }
  @Test
  public void createCustomer() {
	  System.out.println("small - createCustomer");
	   }
  @Test
  public void CreateCustomer() {
	  System.out.println("Capital - createCustomer");
  }
  @Test
  public void updateCustomer() {
	  System.out.println("small - updateCustomer");
  }
  @Test
  public void UpdateCustomer() {
	  System.out.println("Capital - UpdateCustomer");
  }
}
