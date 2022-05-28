package org.dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class WithoughtSelectEx1 {
public static void main(String []args) throws InterruptedException {
	System.out.println(" \" programm start\" ");
	
	BaseUtility bu = new BaseUtility();
	String str = "https://demoqa.com/select-menu";
	WebDriver driver = bu.startup("ch" , str);
	
	WebElement dropDownObj = driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3"));
	dropDownObj.click();
	Thread.sleep(5000);
	System.out.println(driver.getPageSource());
	driver.findElement(By.xpath("//*[text()='Group 2, option 2']")).click();
	dropDownObj.click();
	
	//System.out.println(" \" programm ends\" ");
	
}
}
