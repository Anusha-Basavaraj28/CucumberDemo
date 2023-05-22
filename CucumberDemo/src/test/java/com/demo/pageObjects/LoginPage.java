package com.demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @FindBy(how=How.ID,using="name") WebElement userName;
	 * 
	 * @FindBy(how=How.ID,using="password") WebElement pwd;
	 * 
	 * @FindBy(how=How.ID,using="login") WebElement loginButton;
	 * 
	 * @FindBy(how=How.ID,using="logout") WebElement logoutButton;
	 */
	@FindBy(id = "name")
	@CacheLookup
	WebElement userName;
	
	
	@FindBy(id = "password")
	WebElement pwd;
	
	
	@FindBy(id = "login")
	WebElement loginButton;
	
	
	
	
	public void setUserName(String uName) {
		
		System.out.println("$$$$$$$$$$$$$$$"+uName);
		
		System.out.println("##############################"+userName.getAttribute("placeholder"));
		userName.sendKeys(uName);
		//ldriver.findElement(By.id("name")).sendKeys(uName);
		
	}
	
	
	public void setPassword(String password) {
		pwd.sendKeys(password);
		//ldriver.findElement(By.id("password")).sendKeys(password);
	}

	
	public void clickLogin() {
		loginButton.click();
		//ldriver.findElement(By.id("login")).click();
	}
	
	
}
