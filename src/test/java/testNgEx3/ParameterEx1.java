package testNgEx3;

import org.testng.annotations.Test;

public class ParameterEx1 {
	@Test()
	public void login() {
		System.out.println("LOGIN");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void createCust() {
		System.out.println("createCust");
	}
	@Test
	public void updateCust() {
		System.out.println("updateCust");
	}
	@Test
	public void deletCust() {
		System.out.println("deletCust");
	}
}
