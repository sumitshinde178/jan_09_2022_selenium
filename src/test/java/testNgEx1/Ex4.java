package testNgEx1;

import org.testng.annotations.Test;

public class Ex4 {
  @Test
  public void testMethod1() {
	  System.out.println("TESTMETHOD-1");
	  testMethod2();
  }
  
  public void testMethod2() {
	  System.out.println("TESTMETHOD-2");
  }
  @Test
  public void testMethod3() {
	  System.out.println("TESTMETHOD-3");
	  testMethod4();
  }
  
  public void testMethod4() {
	  System.out.println("TESTMETHOD-4");
  }
}
