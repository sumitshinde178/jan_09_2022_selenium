package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class ActitimeLoginEx4 {
	public static void main(String []args) {
		System.out.println(" \" programm starts \" ");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startup("ch", url);
		String str = driver.getTitle();
		


		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(" input[name = 'pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();

		WebElement logoutButton=driver.findElement(By.id("logoutLink"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logoutButton.click();
		//Thread.sleep(5000);
		System.out.println("ends*********");

	}

}