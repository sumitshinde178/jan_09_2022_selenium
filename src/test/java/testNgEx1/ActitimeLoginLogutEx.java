package testNgEx1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utility.BaseUtility;
//EXECUTION As Per ASCII VALUE
public class ActitimeLoginLogutEx {
	private WebDriver driver;
	private WebElement ele ;
	private BaseUtility bu;

	@Test(priority =1)
	public void browserOpen() {
		System.out.println("OPEN BROWSER START");
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost:90/login.do";
		driver = bu.startup("ch", url);
		System.out.println("OPEN BROWSER END");
	}
	@Test(priority = 2)
	public void doLogin() {
		System.out.println("LOGING START");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(" input[name = 'pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		System.out.println("LOGING ENDS");
	}
	@Test(priority = 3)
	public void doLogout() {
		System.out.println("LOGOUT STARTS");
		WebElement logoutButton=driver.findElement(By.id("logoutLink"));
		logoutButton.click();
		System.out.println("LOGOUT ENDS");
	}
}
