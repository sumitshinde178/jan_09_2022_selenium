package actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class DragAndDropEx1 {
	
		public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.startup("ch" , url);
		
		Actions act = new Actions(driver);//need to send parameter becz it contain default constructor is absend
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, dest).perform();
		System.out.println(" \" programm ends\" ");}
		public void dragAndDropEx(WebDriver driver, WebElement src, WebElement dest) {
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest).perform();//generic
		}
		
	}
	


