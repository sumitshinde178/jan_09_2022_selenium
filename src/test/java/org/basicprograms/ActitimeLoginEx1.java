package org.basicprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class ActitimeLoginEx1 {
	public static void main(String []args) {
		System.out.println(" \" programm starts \" ");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		WebDriver driver = bu.startup("ch", url);
		
		String actTitle = driver.getTitle();
		String expTitle = "actiTIME - Login";
		
		if (expTitle.equals(actTitle)) {
			System.out.println("login Title Match");
		}else {System.out.println("login title dont match");
		//we use if else for to check condition match not for and use code for suitable condition not for 
		// validation we have assertion for validation
	


		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(" input[name = 'pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfWebLocatedBy(driver, "xpath", "//a[@id='logoutLink']", 10);
		
		WebElement logoutButton=driver.findElement(By.id("logoutLink"));
	

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logoutButton.click();
		WebElement ele=null;
		String attributeValue = "";
		List <WebElement> tabList = driver.findElements(By.xpath("//table[@id='topnav']//td/a[contains(@class, 'content')]"));
		for (int i =0 ;i< tabList.size();i++) {
			ele = tabList.get(i);
			attributeValue = ele.getAttribute("class");
			if (attributeValue.contains("selected")) {
				System.out.println("selected ele ="+ ele.getText());
			}
		}
		//Thread.sleep(5000);
		System.out.println("ends*********");
		System.out.println("refer Actitime loginEx5");

	}

}
}