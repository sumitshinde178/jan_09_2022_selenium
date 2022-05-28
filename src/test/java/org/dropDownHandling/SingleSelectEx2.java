package org.dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class SingleSelectEx2 {
	public static void main(String []args) throws InterruptedException  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String str = "https://demoqa.com/select-menu";
		WebDriver driver = bu.startup("ch" , str);

		WebElement singleDDL = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDL);
		
		WebElement selctedElement=sel.getFirstSelectedOption();// it returns element of selected element
		//but we want text or colour which is selected
		String selctedColour = selctedElement.getText();
		if (selctedElement.equals("Red")) {
			System.out.println("Selected colour is Red");
		}else {System.out.println("Selected colour is not Red");}
		
		//we can also check selected colour is match or not by using same methode after selecting colour
		
		sel.selectByVisibleText("Blue");
//		sel.selectByIndex(5);
//		sel.selectByVisibleText(str);
//		Thread.sleep(2000);


		System.out.println(" \" programm ends\" ");

	}
}
