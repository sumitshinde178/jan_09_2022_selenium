package alertEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex1 {
	public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.startup("ch" , url);
		driver.findElement(By.id("promtButton")).click();
		Alert alt =driver.switchTo().alert();//this method returns alert object so we can store in same class object
		System.out.println("text = "+alt.getText());
		alt.sendKeys("my self sumit shinde");
		alt.accept();
		//alt.dismiss();
		System.out.println("*******ends*********");


	}}
