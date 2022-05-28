package org.dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class MultipleSelectEx1 {
	public static void main(String []args) throws InterruptedException  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String str = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startup("ch" , str);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);//page down code

		WebElement multiSelectDDL = driver.findElement(By.id("cars"));
		Select sel = new Select(multiSelectDDL);
		sel.selectByVisibleText("Volvo");
		sel.selectByIndex(3);
		sel.selectByVisibleText("Opel");
		


		System.out.println(" \" programm ends\" ");

	}
}
