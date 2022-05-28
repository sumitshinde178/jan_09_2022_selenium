package org.basicprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.BaseUtility;

public class Basic3Methods {
	public static void main (String [] args) {
		System.out.println("program starts");
		BaseUtility bu = new BaseUtility();
		String str = "https://demoqa.com/dynamic-properties";
		WebDriver driver = bu.startup("ch" , str);
		
		WebElement btn1 = driver.findElement(By.id("enableAfter"));
		//button will be enable after 5 sec so if we removes wait it will give false
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(7));
		wt.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		
		System.out.println("Is Enable  ="+ btn1.isEnabled());
		
		WebElement nobtn = driver.findElement(By.cssSelector("label[for ='noRadio']"));
		System.out.println("yes button is enable = " +nobtn.isDisplayed());
		
		WebElement yesbtn = driver.findElement(By.cssSelector("label[for ='yesRadio']"));
		System.out.println("yes button is enable = " +yesbtn.isEnabled());
		System.out.println("program ends");
	}

}
