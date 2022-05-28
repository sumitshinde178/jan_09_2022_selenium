package actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class DragAndDropEx2 {

	public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/droppable";
		WebDriver driver = bu.startup("ch" , url);

		Actions act = new Actions(driver);//need to send parameter becz it contain default constructor is absend

		WebElement src = driver.findElement(By.id("draggable"));
		act.dragAndDropBy(src, 100, 100).perform();
		
				System.out.println(" \" programm ends\" ");}


}



