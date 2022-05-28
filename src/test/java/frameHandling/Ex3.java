package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class Ex3 {public static void main(String []args)   {
	System.out.println(" \" programm start\" ");

	BaseUtility bu = new BaseUtility();
	String url = "https://demoqa.com/frames";
	WebDriver driver = bu.startup("ch" , url);
	
	WebElement frame1 = driver.findElement(By.id("frame1"));//finding webelement of child frame
	driver.switchTo().frame(frame1);//move to child frame
	
	String text = driver.findElement(By.id("sampleHeading")).getText();//finding webelement in child frame,get will give webelement to text
	System.out.println("text ="+text);
	
	driver.switchTo().defaultContent();//moving out i.e at main parent element
	
	WebElement frame2 = driver.findElement(By.id("frame2"));//finding webelement of child frame
	driver.switchTo().frame(frame2);//move to child frame
	String text2 = driver.findElement(By.id("sampleHeading")).getText();//finding webelement in child frame,get will give webelement to text
	System.out.println("text2 ="+text2);
	
	System.out.println(" \" programm ends\" ");
	//this wont give element excepation because we moved to child frame and element is present in same child frame
}
}
