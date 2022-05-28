package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class Ex4 {public static void main(String []args)   {
	System.out.println(" \" programm start\" ");

	BaseUtility bu = new BaseUtility();
	String url = "https://demoqa.com/nestedframes";
	WebDriver driver = bu.startup("ch" , url);

	WebElement frame1 = driver.findElement(By.id("frame1"));//finding webelement of child frame1
	driver.switchTo().frame(frame1);//move to child frame

	WebElement frame2 = driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));//finding webelement of child frame2
	driver.switchTo().frame(frame2);//move to child frame
	//finding webElement of child frame

	String text = driver.findElement(By.tagName("p")).getText();//find and text child-child element
	System.out.println("text ="+text);
	
	System.out.println(" \" programm ends\" ");
	//this wont give element excepation because we moved to child frame and element is present in same child frame
}
}
