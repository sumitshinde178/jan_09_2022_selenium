package org.dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class MultipleSelectEx4 {
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
//		sel.selectByVisibleText("Volvo");
//		sel.selectByIndex(3);
//		sel.selectByVisibleText("Opel");
		//be hetAllSelectedOption method from Select class returns List of WebElement 
		//But we want text and inside List there is get(index) method by this method we can get webelement with index
		//and By using getText method from webelement we can get text of all element
		List<WebElement> allSelectOption = sel.getAllSelectedOptions();
		for (int i=0;i<allSelectOption.size();i++) {
			allSelectOption.get(i).getText();
		}
		


		System.out.println(" \" programm ends\" ");

	}
}
