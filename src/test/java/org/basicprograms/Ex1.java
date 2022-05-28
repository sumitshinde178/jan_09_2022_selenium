package org.basicprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {
	//we are learning how to open browsers
	public static void main (String [] args) {
		System.out.println("\"programm strats\"");
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",//we are telling that which driver u have to use and where is ur chrome exe file is located
				path+"\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup(); //if we dont have to remind above set methode then us this code but it is not supported in 
		//pirated system and in thid code we dont need to update exe file in drivers folder but need to add webdriver maven dependancy
		ChromeDriver chromeobj = new ChromeDriver();//opens browser
		Ex1 obj = new Ex1();
		//obj.testFireFox();
		//obj.testEdge();

		System.out.println("\"programm ends\"");
	}
	public void testFireFox() {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
		FirefoxDriver ffobj = new FirefoxDriver();//opens browser

	}
	public void testEdge() {
		String path =System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver",
				path+"\\drivers\\msedgedriver.exe");
		EdgeDriver edgeobj = new EdgeDriver();//opens browser
	}
}

