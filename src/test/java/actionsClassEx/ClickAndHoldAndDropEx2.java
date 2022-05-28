package actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ClickAndHoldAndDropEx2 {

	public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/links";
		WebDriver driver = bu.startup("ch" , url);

		Actions act = new Actions(driver);//need to send parameter becz it contain default constructor is absend
		WebElement ele = driver.findElement(By.id("simpleLink"));
		act.moveToElement(ele).click().perform();
		act.doubleClick(ele).build().perform();
	
		
		Thread.sleep(2000);
		System.out.println(" \" programm ends\" ");}
	

}



