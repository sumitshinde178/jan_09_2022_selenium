package testNgEx1;

import org.testng.annotations.Test;

public class Ex2 {
	@Test
	public void testMethod1() {
		System.out.println("TESTMETHOD-1");
	}
	//if we don'd write @Test before any test case then that test case wont execute
	public void testMethod2() {
		System.out.println("TESTMETHOD-2");
	}
	@Test
	public void testMethod3() {
		System.out.println("TESTMETHOD-3");
	}
	//if we don'd write @Test before any test case then that test case wont execute
	public void testMethod4() {
		System.out.println("TESTMETHOD-4");
	}
}
