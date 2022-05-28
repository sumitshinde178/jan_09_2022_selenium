package org.fileUploadDownload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.BaseUtility;

public class Ex1 {
	public static void main(String[]args) throws InterruptedException, IOException {
		System.out.println("*******program starts*********");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startup("ch", url);
		Thread.sleep(3000);

		//driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.cssSelector(".form-file-label")).click();
		Thread.sleep(3000);
		//uploadbtn.click();
		//bu.scrollTillElementByJS(uploadBtn, driver);
		//bu.clickByJS(uploadBtn, driver);
		//Thread.sleep(3000);
		Runtime.getRuntime().exec("./autoItFiles/ChromeUpload.exe");
		System.out.println("*******program ends*********");

	}

}


