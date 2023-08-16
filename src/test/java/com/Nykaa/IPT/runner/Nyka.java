package com.Nykaa.IPT.runner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nyka {
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\NIRUBAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.nykaa.com/");
		  
		  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		   
//		  WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
//		  
//		  signin.click();
//		  
//		  WebElement element =  driver.findElement(By.xpath("//button[@class='css-ejuz3m'][1]"));
//		  
//		  element.click();
//		  
//		  WebElement login = driver.findElement(By.xpath("//input[@name='emailMobile']"));
//		  
//		  login.sendKeys("8072280242");
//		  
//		  WebElement submit = driver.findElement(By.id("submitVerification"));
//		  
//		  submit.click();
//		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//a[text()='hair']")).click();
		 
		 Set<String> windowhandle = driver.getWindowHandles();
		
	     for (String multi : windowhandle) {
	    	
	     String title = driver.switchTo().window(multi).getTitle();
	     
	     System.out.println(title);
	     	
		}
	     
	     String title = "Buy Cosmetics Products & Beauty Products Online in India at Best Price | Nykaa";
	     
	     for (String multi : windowhandle) {
	    	 
	    	 if (driver.switchTo().window(multi).getTitle().equals(title)) {
				
			}
		}
	     
	     
	     
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    
		    js.executeScript("window.scrollBy(0,2000)");
		     
		    WebElement element2 =  driver.findElement(By.xpath("//img[@alt='WOW Skin Science Onion Hair Oil With Black Seed Oil Extracts - Controls Hair Fall']"));
		     
		    element2.click();
		    
		   WebElement element5  =  driver.findElement(By.xpath("//span[text()='Add to Bag']"));
		   
		   element5.click();
		    
		   WebElement element3 =  driver.findElement(By.xpath("//span[@class='cart-count']"));
		   
		   element3.click();
		   
		   
		   driver.switchTo().frame(0);
		   
	       WebElement element4 =  driver.findElement(By.xpath("//span[text()='Proceed']"));
		   
		   element4.click();
		     
	      WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
	      
	      pincode.sendKeys("600072");
	      
	      Thread.sleep(3000);
	      
          WebElement address1 = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
	      
	      address1.sendKeys("No.22,Sasthirinagar,pattabiram");
	      
	      Thread.sleep(3000);
	      
          WebElement No = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
	      
	      No.sendKeys("No.22");
	      
	      Thread.sleep(3000);
	      
          WebElement address2 = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
	      
	      address2.sendKeys("No.22,Sasthirinagar,pattabiram");
	      
	      Thread.sleep(3000);
	      
	      WebElement ship =   driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
	     
	      ship.click();
	     
	      WebElement payment =   driver.findElement(By.xpath("//p[@class='css-1cixtgw eoygcm00']"));
	    
	      payment.click();
	    
	      WebElement placed =   driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
	      
	     placed.click();  
	      
	      
		
	   
	   
	     
	     
	     
	    
	    
	     
		 
		
		
		  
		
		  
		  
	}

}
