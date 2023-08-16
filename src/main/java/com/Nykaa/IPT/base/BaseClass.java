package com.Nykaa.IPT.base;

import java.io.File;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	//browser launch
	public static void browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	//close Method
	public static void close() {
		driver.close();
	}
	
	//Quit Method
	public static void quit() {
	driver.quit();	
	}
	
	//Navigate To method
	public static void navigateTo(String url) {
	driver.navigate().to(url);	
	}
	
	//Other Navigation Methods
	
	public static void navigate(String input) {
	if(input.equalsIgnoreCase("forward")) {
	driver.navigate().forward();	
	}
	else if(input.equalsIgnoreCase("back")) {
	driver.navigate().back();	
	}
	else if(input.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();	
	}
	
	}
	
	//Get Method
	
	public static void getUrl (String url) {
	driver.get(url);	
	}
	
	//Alert Methods
	
	public static void alerts(String value) {
	if (value.equalsIgnoreCase("accept")) {
	driver.switchTo().alert().accept();	
	}
	else if (value.equalsIgnoreCase("dismiss")) {
	driver.switchTo().alert().dismiss();	
	}
	else if(value.equalsIgnoreCase("getText")) {
	System.out.println("Alert Text: "+driver.switchTo().alert().getText());
	
	}
	
	}
	
	//Alert Method to SendText
	
	public static void sendAlert (String Input) {
	driver.switchTo().alert().sendKeys(Input);	
	}
	
	//Action Class Method Using WebElement
	
	public static void actionWebElement(WebElement Element, String input) {
	Actions acweb = new Actions(driver);
	
	if(input.equalsIgnoreCase("click WebElement")) {
		acweb.click(Element).build().perform();
	}
	
	
		public void launchUrl(String url) {
			driver.get(url);
			
		}
		
		public void elementClick(WebElement element) {
			element.click();
		}
		
		public void elementInput(WebElement element, String input) {
			element.sendKeys(input);
		}
		
		public void screenshot(String fileName) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Ruban\\Selinium\\Nykaa.IPT\\screenshorts\\"+fileName+".png");
			try {
				FileHandler.copy(scr, dest);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
