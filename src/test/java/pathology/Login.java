package pathology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main (String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("Start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		
		
		driver.get("https://gor-pathology.web.app/");
		
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		
		WebElement click = driver.findElement(By.xpath("//span[text()='Login']"));
		click.click();
		Thread.sleep(2000);
WebElement element = driver.findElement(By.partialLinkText("UR URIC ACID"));
element.click();
//		Select s= new Select(chk);
//		s.selectByVisibleText("Beans");
		
		
	}
	
}
