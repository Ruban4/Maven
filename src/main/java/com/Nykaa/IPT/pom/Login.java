package com.Nykaa.IPT.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	public Login() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "")
	private WebElement signIn_btn;
	
	@FindBy(xpath = "")
	private WebElement signInMobile_btn;

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}	

	public WebElement getSignInMobile_btn() {
		return signInMobile_btn;
	}
	
	
	
}

