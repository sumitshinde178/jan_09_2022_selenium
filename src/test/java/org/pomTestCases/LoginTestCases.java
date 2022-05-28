package org.pomTestCases;

import org.openqa.selenium.WebDriver;
import org.pomPages.LoginPage;
import org.propertiesOperations.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utility.BaseUtility;

public class LoginTestCases {
	BaseUtility bu = new BaseUtility();
	private WebDriver driver;
	private ConfigReader cr;
	@BeforeSuite
	public void initializeObjects() {
		System.out.println("1");
		//ConfigReader cr = new ConfigReader();
	}
	@BeforeMethod
	public void initializeBrowser() {
		System.out.println("Open Browser");
		String url = "http://localhost:90/login.do";
		driver = bu.startup("ch",url);}

	@Test
	public void login() {
		//		driver.findElement(By.id("username")).sendKeys(cr.getPropData("userName"));
		//		driver.findElement(By.cssSelector(" input[name = 'pwd']")).sendKeys(cr.getPropData("passward"));
		//		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//		bu.waitForVisibilityOfWebElement(driver, null, 0);
		System.out.println("2");
		LoginPage lp = new LoginPage(driver);
		System.out.println("3");
		lp.enteruName("admin");
		System.out.println("4");
		lp.enterpwd("manager");
		System.out.println("5");
		lp.clickLoginBtn();
		System.out.println("6");}
	@Test
	public void verifyLoginPage() {
		System.out.println("7");
		LoginPage lp = new LoginPage(driver);
		System.out.println("8");
		lp.loginBtnTxtFieldDisplay();
		System.out.println("9");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("10");
		driver.close();
	}




}



