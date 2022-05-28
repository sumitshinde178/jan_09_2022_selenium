package browserOperations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseUtility;

public class Ex1 {
	public static void main(String []args) throws InterruptedException  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startup("ch" , url);//this is opening chrome and then site
		
		String parentId1 = driver.getWindowHandle();//it will return unique id
		System.out.println("parentId1 ="+parentId1);
		
		driver.findElement(By.id("tabButton")).click();//this will find tab element and click()will click 
		//on tab and open new tab but  driver is presenting same window page then 
		String parentId2 = driver.getWindowHandle();
		System.out.println("parentId2 ="+parentId2); //here we r checking driver is on same page or not by comparing unique id
		System.out.println("parentId1 ="+parentId2);
		//String text = driver.findElement(By.id("sampleHeading")).getText();
		Set<String>allWindowIds = driver.getWindowHandles();//it return set of string which has unique is

		
		java.util.Iterator<String> itr =  allWindowIds.iterator();
		//allWindowIds.iterator();
		
		String id1 =itr.next();
		System.out.println("id1 = "+id1);
		String id2 = itr.next();
		System.out.println("id2 = "+id2);
		
		driver.switchTo().window(id2);
	
		
		//String text = driver.findElement(By.id("sampleHeading")).getText();
		//System.out.println(text);
		
		//we try to find element on tab windo
		//but driver still didnt move to next page it repesenting the same page so it will give no such element exception 
		//because this element present at other window page and we are trying to search on same page


		System.out.println(" \" programm ends\" ");

	}
}
