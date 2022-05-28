package org.dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx1 {
	public static void main(String []args) throws InterruptedException  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String str = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startup("ch" , str);

		WebElement singleDDL = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDL);
		sel.selectByVisibleText("Blue");
//		sel.selectByIndex(5);
//		sel.selectByVisibleText(str);
//		Thread.sleep(2000);


		System.out.println(" \" programm ends\" ");

	}
}
