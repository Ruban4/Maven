package com.Nykaa.IPT.runner;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Nykaa1 {
	static WebDriver driver;
	static Actions a;
	static Robot r;
	static Select s;
		
	public static void browserlaunch() {
			

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com");
		}
		
	public static void logIn() throws Throwable {
//syso
			WebElement signinbtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
			signinbtn.click();
			
			WebElement signinmob = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
			signinmob.click();
			Thread.sleep(2000);
			
			WebElement mobileno =	driver.findElement(By.xpath("//input[@name='emailMobile']"));
			mobileno.sendKeys("8072280242");
			
			WebElement submitbtn = driver.findElement(By.id("submitVerification"));
			submitbtn.click();
			
			Thread.sleep(15000);
			WebElement verifybtn = driver.findElement(By.xpath("//button[@type='submit']"));
			verifybtn.click();
		}
		
	public static void productSearch() throws Throwable {

		r= new Robot();

	//Actons Class	
		a = new Actions(driver);
		Thread.sleep(3000);
		WebElement mombabytab= driver.findElement(By.xpath("//a[text()='mom & baby']"));
		a.moveToElement(mombabytab).build().perform();
		
		WebElement powderbtn = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
		a.click(powderbtn).build().perform();
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);

	//Window Handles
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		Thread.sleep(3000);

		WebElement powder = driver.findElement(By.xpath("//div[text()='Himalaya Baby Powder']"));
		a.click(powder).build().perform();
		Thread.sleep(4000);
		}
		
	public static void addToCart() throws Throwable {
			
	//Window Handle
			
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				driver.switchTo().window(string);
			}
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		WebElement dropdown = driver.findElement(By.cssSelector("select.css-2t5nwu"));
		s = new Select(dropdown);
		s.selectByValue("2");
		
		WebElement addtobag = driver.findElement(By.xpath("(//span[text()='Add to Bag'][1])"));
		addtobag.click();
		}
		
	public static void bagFrame() throws Throwable { 
		
		WebElement bag= driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		bag.click();
		Thread.sleep(4000);

	// Iframe
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		
		WebElement quant = driver.findElement(By.xpath("//p[text()='Quantity : 1']"));
		quant.click();
		Thread.sleep(2000);
		
		WebElement quannos = driver.findElement(By.xpath("(//div[@value='3'])[1]"));
		quannos.click();
		Thread.sleep(5000);
		
		WebElement proceedbtn = driver.findElement(By.xpath("//span[text()='Proceed']"));
		proceedbtn.click();
		}
		
	public static void addressPage() throws Throwable {

		Thread.sleep(3000);
	WebElement deliverbtn = driver.findElement(By.xpath("//button[text()='Deliver here']"));
		deliverbtn.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//			
//		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
//		pincode.sendKeys("600002");
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(5000);
//		
//		WebElement doorno = driver.findElement(By.xpath("//input[@class='input-element  ']"));
//		doorno.sendKeys("No 77");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//textarea[@class='input-element input-area ']")).sendKeys("Chennai");
//			
//		WebElement place = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
//		place.sendKeys("Chennai");
//		Thread.sleep(2000);
//		
//		js.executeScript("window.scrollBy(0,300)");
//		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
//		name.sendKeys("");
//		Thread.sleep(2000);
//			
//		WebElement Mbnumber = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
//		Mbnumber.sendKeys("");
//		Thread.sleep(2000);
//			
//		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"));
//		email.sendKeys("");
//		Thread.sleep(2000);		
//			
//		WebElement shipbtn = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
//		shipbtn.click();
//		Thread.sleep(5000);
		}
		
	public static void paymentPage() throws Throwable {

		Thread.sleep(5000);
		WebElement cardno = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		cardno.click();
		Thread.sleep(5000);
		cardno.sendKeys("no");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		WebElement expdate = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
		expdate.sendKeys("06/26");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		WebElement cvvnum = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvvnum.sendKeys("987");
		Thread.sleep(2000);
		
		WebElement proceedbtn = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		proceedbtn.click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='Pay without securing card']")).click();
		
		Thread.sleep(7000);
		
//		driver.findElement(By.xpath("//button[text()='Pay Now']")).click();
		
		Thread.sleep(9000);
		screenshot("Payment Screenshot");
	}

	public static void logout() {
		
		WebElement close = driver.findElement(By.xpath("button.css-1iwzqhf.emgaj5l0"));
		close.click();
		
	}


	public static void screenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Ruban\\Selinium\\Nykaa.IPT\\screenshorts\\"+filename+".png");
		try {
			FileHandler.copy(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

public static void main (String[] args) throws Throwable {
	browserlaunch();
	logIn();
productSearch();
addToCart();
bagFrame();
addressPage();
paymentPage();
logout();
	
}
}