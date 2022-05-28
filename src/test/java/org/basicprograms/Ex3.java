package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex3 {
	WebDriver driver ; //null and we just declared it
	String path = System.getProperty("user.dir");

	public static void main (String [] args) {
		System.out.println("\"programm strats\"");

		Ex2 obj = new Ex2();
		obj.openBrowser("ch");


		System.out.println("\"programm ends\"");}

	public WebDriver openBrowser ( String  BName ) {


		if(BName.equalsIgnoreCase("ch")|| BName.equalsIgnoreCase("CH")||BName.equalsIgnoreCase("Chrome"))	
		{System.setProperty("webdriver.chrome.driver",
				path+"\\drivers\\chromedriver.exe");
		//ChromeDriver obj = new ChromeDriver();
		driver = new ChromeDriver();} //(implisit Upcasting)}
		//w]WebDriver driver = new ChromeDriver(); this was above statement but webdriver is common hence we wrote it globally

		else if (BName.equalsIgnoreCase("ff")|| BName.equalsIgnoreCase("FF")||BName.equalsIgnoreCase("Firefox")){System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
		//FirefoxDriver obj = new FirefoxDriver();
		driver = new FirefoxDriver();} //(implicit Upcasting)}
		//w]WebDriver driver = new FirefoxDriver(); this was above statement but webdriver is common hence we wrote it globally

		else if(BName.equalsIgnoreCase("edge")||BName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver",

					path+"\\drivers\\msedgedriver.exe");
			//EdgeDriver obj = new EdgeDriver();
			driver = new EdgeDriver();}  //(implicit Upcasting)
		//w]WebDriver driver = new EdgeDriver(); this was above statement but webdriver is common hence we wrote it globally
		else {System.out.println("invalid web");}

		return driver ;
	}}

