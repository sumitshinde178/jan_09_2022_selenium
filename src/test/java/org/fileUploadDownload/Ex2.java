package org.fileUploadDownload;

import org.openqa.selenium.WebDriver;
import org.utility.BaseUtility;

public class Ex2 {
	public static void main(String[]args)  {
		System.out.println("*******program starts*********");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startup("ch", url);
		
		System.out.println("*******program ends*********");

	}

}


