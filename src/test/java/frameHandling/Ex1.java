package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex1 {public static void main(String []args)   {
	System.out.println(" \" programm start\" ");

	BaseUtility bu = new BaseUtility();
	String url = "https://demoqa.com/frames";
	WebDriver driver = bu.startup("ch" , url);
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("text ="+text);
	System.out.println(" \" programm ends\" ");
	//this will give no such element excepation
}
}
