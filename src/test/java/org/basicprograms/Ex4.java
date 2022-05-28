package org.basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.utility.BaseUtility;


public class Ex4 {
	
	public static void main (String [] args) {
		System.out.println("\"programm strats\"");

		BaseUtility bu = new  BaseUtility();
		
		String url =" https://www.google.com";

		WebDriver driver = bu.startup("ch",url);
		System.out.println("\"programm ends\"");
		}

}

