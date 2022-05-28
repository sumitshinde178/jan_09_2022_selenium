package alertEx;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class Ex2 {
	public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startup("ch" , url);
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		Alert alt =driver.switchTo().alert();//this method returns alert object so we can store in same class object
		System.out.println("text = "+ alt.getText());
		alt.accept();
		
		//alt.getText();
		System.out.println("******ends********");


	}}
