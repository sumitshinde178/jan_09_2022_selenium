package org.basicprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class ActitimeLoginEx7 {
	public static void main(String []args) {
		System.out.println(" \" programm starts \" ");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startup("ch", url);
		String str = driver.getTitle();
		
		String expurl = "http://localhost:90/login.do";
		String acturl = driver.getCurrentUrl();
		if (expurl.equals(acturl)) {
			System.out.println(" login url matches ");
		}


		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(" input[name = 'pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		 String expurl1 = "http://localhost:90/user/submit_tt.do";
		 String acturl1 = driver.getCurrentUrl();
		if (expurl1.equals(acturl1)) {
			System.out.println("dashboard  url matches ");
		}else {System.out.println("dashboard  url dont matches");

//		WebElement tabName = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
//		String attributeValue = tabName.getAttribute("class");
//			
//			if (attributeValue.contains("selected")) {
//				System.out.println("selected ele ="+ tabName.getText());}
//
//		//WebElement logoutButton=driver.findElement(By.id("logoutLink"));
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//logoutButton.click();
//		//Thread.sleep(5000);
		System.out.println("ends*********");

		}}}

