package org.pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPage {
	private WebDriver driver;
	//FIND ELEMENT
	@FindBy(id = "username")
	private WebElement uNameTxtField;

	@FindBy(css = "input[name = 'pwd'] ")
	private WebElement pwdTxtField;

	@FindBy(css = "#loginButton>div")
	private WebElement loginBtnTxtField;

	//	@FindBy(xpath = "")
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Page Action Methode
	public boolean ispwdTxtField() {
		return pwdTxtField.isDisplayed();
	}
	public boolean isuNameTxtFieldDisplay() {
		return uNameTxtField.isDisplayed();
	}
	public boolean loginBtnTxtFieldDisplay() {
		return loginBtnTxtField.isDisplayed();
	}
	public void enteruName(String uName) {
		uNameTxtField.sendKeys(uName);}
		
	public void enterpwd(String pwd) {
		pwdTxtField.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		loginBtnTxtField.click();
		
	}
	public void verifyLoginPageField() {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(isuNameTxtFieldDisplay()," user name Not Present");
		sa.assertTrue(ispwdTxtField()," user name Not Present");
		sa.assertTrue(loginBtnTxtFieldDisplay()," user name Not Present");
		sa.assertAll();
	}
	
	
	
	
	//	private List<WebElement> multipleElementEx;
	//	



}
