package browserOperations;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;
public class Ex4 {
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
				List<WebElement> listEle = driver.findElements(By.id("sampleHeading"));
				if (!listEle.isEmpty()) {
					String text = listEle.get(0).getText();
					System.out.println("text = "+ text);
					break;
				}
				System.out.println("switching to next window");
			}
		}
	System.out.println("ends");}}

