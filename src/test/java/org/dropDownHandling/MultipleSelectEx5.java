package org.dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class MultipleSelectEx5 {
	public static void main(String []args) throws InterruptedException  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startup("ch" , url);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);//page down code

		WebElement multiSelectDDL = driver.findElement(By.id("cars"));
		Select sel = new Select(multiSelectDDL);
		
		List <WebElement> allOptions = sel.getOptions();//get option returns all webelement list present in dropdown and returns list of webelement
		String str1 = " ";
		for (int i = 0; i<allOptions.size();i++) {
			
			System.out.println(allOptions.get(i).getText()); 
				sel.selectByIndex(i);
			
		}
		sel.deselectByIndex(1);
		//sel.deselectAll();
		//sel.deselectByValue(str1);
		sel.deselectByVisibleText("Audi");
	
	
		System.out.println(" \" programm start\" ");

	}}

