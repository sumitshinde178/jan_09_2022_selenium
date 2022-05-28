package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class ActitimeLoginEx3 {
	public static void main(String []args) {
		System.out.println(" \" programm starts \" ");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startup("ch", url);
		WebElement uNameField = driver.findElement(By.id("username"));
		uNameField.sendKeys("admin");
		WebElement pwdField = driver.findElement(By.cssSelector(" input[name = 'pwd']"));
		pwdField.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.cssSelector("#loginButton>div"));
		loginButton.click();
		//WebElement logoutButton=driver.findElement(By.id("logoutLink"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//logoutButton.click();
		//Thread.sleep(5000);0
		bu.waitForVisibilityOfWebLocatedBy(driver, "id", "logoutLink", 12);

		System.out.println("ends*********");

	}

}
