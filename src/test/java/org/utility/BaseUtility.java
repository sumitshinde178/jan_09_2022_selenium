package org.utility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {

	public WebDriver startup ( String  BName, String url ) {
		WebDriver driver=null ; //null and we just declared i
		String path = System.getProperty("user.dir");

		if(BName.equalsIgnoreCase("ch")|| BName.equalsIgnoreCase("CH")||BName.equalsIgnoreCase("Chrome"))	
		{System.setProperty("webdriver.chrome.driver",
				path+"\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();} //(implisit Upcasting)}

		else if (BName.equalsIgnoreCase("ff")|| BName.equalsIgnoreCase("FF")||BName.equalsIgnoreCase("Firefox")){System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();} //(implicit Upcasting)}

		else if(BName.equalsIgnoreCase("edge")||BName.equalsIgnoreCase("EDGE")) {
			System.setProperty("webdriver.edge.driver",path+"\\drivers\\msedgedriver.exe");

			driver = new EdgeDriver();}  //(implicit Upcasting)
		else {System.out.println("invalid web");}
		driver.manage().window().maximize();//this methode maximize window 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); suitable for java 3
		//driver.manage().window().minimize();//this methode minimize window (present in only selenium 4) 
		//driver.manage().window().setSize(new Dimension(400,900));//import org.openqa.selenium.Dimension
		driver.get(url);
		return driver ;
	}
	public void waitForVisibilityOfWebElement(WebDriver driver,WebElement ele, int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));}

	public void waitForVisibilityOfWebLocatedBy(WebDriver driver,String locType ,String locator, int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		switch(locType) {
		case "xpath" :wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		break;
		case "cssSelector" : wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		break;
		case "id" : wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		break;
		case "class" : wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		}}
	public void waitForClicableOfWebElement(WebDriver driver,String locator, int time) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(By.className(locator)));

	}
	public boolean isAlertPresent (WebDriver driver, int time) {

		try{WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		return true;}catch(Exception e) {
			return false;
		}
	}

	public void scrollTillElementByJS(WebElement ele,WebDriver driver)
	{JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", ele);}

	public void clickByJS(WebElement ele,WebDriver driver)
	{JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].Click", ele);}}

