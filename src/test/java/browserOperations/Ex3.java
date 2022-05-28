package browserOperations;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex3 {
	public static void main(String []args)  {
		System.out.println(" \" programm start\" ");

		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.startup("ch" , url);
		
		String parentId1 = driver.getWindowHandle();
		System.out.println("parentId1 ="+parentId1);
		
		driver.findElement(By.id("windowButton")).click();
		
		//String text = driver.findElement(By.id("sampleHeading")).getText();
		//System.out.println("text ="+text);
		

		Set<String>allWindowIds = driver.getWindowHandles();
		Iterator<String> itr = allWindowIds.iterator();
		String id ="";
		while (itr.hasNext()) {
		id = itr.next();
		if (!id.equals(parentId1)) {
			driver.switchTo().window(id);
			try{String text = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println("text = "+ text);
			break;
			}catch(NoSuchElementException e) {
				e.printStackTrace();
				System.out.println("switching to next window");
			}
		}
			
		}
		
		
		//driver.quit();
		driver.close();
		
	
		
		//String text = driver.findElement(By.id("sampleHeading")).getText();
		//System.out.println(text);
		
		//we try to find element on tab windo
		//but driver still didnt move to next page it repesenting the same page so it will give no such element exception 
		//because this element present at other window page and we are trying to search on same page


		System.out.println(" \" programm ends\" ");

	}
}
