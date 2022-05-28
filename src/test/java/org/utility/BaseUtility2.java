package org.utility;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtility2 {
	

	public WebDriver startup ( String  BName, String url ) {
		WebDriver driver=null ; //null and we just declared it
		String path = System.getProperty("user.dir");

		if(BName.equalsIgnoreCase("ch")|| BName.equalsIgnoreCase("CH")||BName.equalsIgnoreCase("Chrome"))	
		{System.setProperty("webdriver.chrome.driver",
				path+"\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();} //(implisit Upcasting)}

		else if (BName.equalsIgnoreCase("ff")|| BName.equalsIgnoreCase("FF")||BName.equalsIgnoreCase("Firefox")){System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();} //(implicit Upcasting)}

		else if(BName.equalsIgnoreCase("edge")||BName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver",

					path+"\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();}  //(implicit Upcasting)
		else {System.out.println("invalid web");}
		driver.manage().window().maximize();//this methode maximize window 
		//driver.manage().window().minimize();//this methode minimize window (present in only selenium 4) 
		//driver.manage().window().setSize(new Dimension(400,900));//import org.openqa.selenium.Dimension
		driver.get(url);

		return driver ;
	}}


