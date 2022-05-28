package actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseUtility;

public class ClickAndHoldAndDropEx {

	public static void main(String []args) throws InterruptedException{
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/links";
		WebDriver driver = bu.startup("ch" , url);

		Actions act = new Actions(driver);//need to send parameter becz it contain default constructor is absend
		WebElement ele = driver.findElement(By.id("simpleLink"));
		act.moveToElement(ele).click().perform();
		//act.click(ele).perform(); //OR
		//act.contextClick(ele).perform();//for right click
		//for new window
		act.keyDown(Keys.LEFT_CONTROL)
		.click(ele)
		.keyUp(Keys.LEFT_CONTROL)
		.build()
		.perform(); //this is clicking right the selecting create new windo
		
		Thread.sleep(2000);
		System.out.println(" \" programm ends\" ");}

	//		public void dragAndDropEx(WebDriver driver, WebElement src, WebElement dest) {
	//			Actions act = new Actions(driver);
	//			act.dragAndDrop(src, dest).perform();//generic


}



