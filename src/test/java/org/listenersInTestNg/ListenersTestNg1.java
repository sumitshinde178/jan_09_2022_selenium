package org.listenersInTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ListenersTestNg1 {
	WebDriver driver=null;
	@BeforeSuite
	public void startUp() {
		System.out.println("Before Suite");
		System.setProperty("webdriver.chrome.driver", null);
		driver = new ChromeDriver();
	}
	@Test //succedd Test
	public void closeBrowser() {
		System.out.println("closing browser");
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	@Test //Failed Test
	public void openBrowser() {
		Reporter.log("Trying To Hit URL");
		driver.get("https://www.demoqa.com");
		String expectedTitle = "Free QA Automation Tool";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("After Suite");
		Reporter.log("After Suite");
		driver.quit();
	}
	
}
