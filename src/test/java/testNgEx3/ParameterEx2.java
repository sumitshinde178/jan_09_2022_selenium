package testNgEx3;

import org.testng.annotations.Test;

public class ParameterEx2 {
	@Test()
	public void login() {
		System.out.println("LOGIN");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}
	@Test(enabled = false)
	public void createCust() {
		System.out.println("createCust");
	}
	@Test(enabled = false)
	public void updateCust() {
		System.out.println("updateCust");
	}
	@Test(enabled = false)
	public void deletCust() {
		System.out.println("deletCust");
	}
}
