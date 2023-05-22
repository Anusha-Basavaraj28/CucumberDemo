package com.demo.StepDefinitions;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import java.util.Properties;


import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.demo.Utility.DataReader;
import com.demo.pageObjects.HomePage;
import com.demo.pageObjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions2_POM {

	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	String path="C://Users//anush//eclipse-workspace//CucumberDemo//config.properties";
	String br;
	String URL;
	FileInputStream file;
	Properties pro;

	@Given("Browser is open")
	public void browser_is_open() {
		
		System.out.println("======I am inside login POM demo class======");
		try {
			file=new FileInputStream(path);
			pro= new Properties();
			pro.load(file);
			
			br=pro.getProperty("browser");
			
			if(br.equals("chrome"))
				driver = new ChromeDriver();
			if(br.equals("edge"))
				driver = new EdgeDriver();
			if(br.equals("ff"))
				driver = new FirefoxDriver();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	@And("User opens the application login page")
	public void user_opens_the_application_login_page() {
		
		try {
			file=new FileInputStream(path);
			
			pro=new Properties();
			pro.load(file);
			URL=pro.getProperty("URL");
			
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}

	@When("user enters valid email as {string} and password as {string}")
	public void user_enters_valid_email_as_and_password_as(String userName, String pwd) {

		System.out.println("&&&&&&&&&&&&&&&&&&&&&" + userName);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&" + pwd);
		lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(pwd);
	}

	@When("user enters valid email and password from excel sheet row {string}")
	public void user_enters_valid_email_and_password_from_excel_sheet_row(String row) throws Exception {
		lp = new LoginPage(driver);
		String[] s = DataReader.getDataFromExcel(row);

		lp.setUserName(s[0]);
		lp.setPassword(s[1]);

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {

		lp.clickLogin();
	}

	@Then("user should be able to logged in and navigated to home page")
	public void user_should_be_able_to_logged_in_and_navigated_to_home_page() {
		hp=new HomePage(driver);

		boolean status = hp.checkLogoutDisplayed();
		Assert.assertTrue(status);
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	} 
	 

}
