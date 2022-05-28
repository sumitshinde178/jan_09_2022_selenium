package org.dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class WithoughtSelectMultiEx1 {
public static void main(String []args) throws InterruptedException  {
	System.out.println(" \" programm start\" ");
	
	BaseUtility bu = new BaseUtility();
	String str = "https://demoqa.com/select-menu";
	WebDriver driver = bu.startup("ch" , str);
	
	driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	Thread.sleep(2000);
	
	WebElement dropDownObj = driver.findElement(By.xpath("(//div[@class =' css-1hwfws3'])[3]"));
	dropDownObj.click();
	Thread.sleep(2000);
	
	//System.out.println(driver.getPageSource());
	driver.findElement(By.xpath("//div[text()='Blue']")).click();
	//dropDownObj.click();
	driver.findElement(By.xpath("//div[text()='Green']")).click();
	//dropDownObj.click();
	
	System.out.println(" \" programm ends\" ");
	
}
}
