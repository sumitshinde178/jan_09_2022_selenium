package actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ACEx1 {
	
		public static void main(String []args){
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/tool-tips";
		WebDriver driver = bu.startup("ch" , url);
		WebElement btn = driver.findElement(By.cssSelector(".btn.btn-success"));
		Actions act = new Actions(driver);//need to send parameter becz it contain default constructor is absend
		act.moveToElement(btn).perform();// we moved to button then we can find dynamic element come only after moved to button
		//we need to tell to perform bcz action too is lazy
		String toolTip = driver.findElement(By.className("tooltip-inner")).getText();
		System.out.println("toolTip ="+toolTip);
		System.out.println(" \" programm ends\" ");
		
	}
	}


