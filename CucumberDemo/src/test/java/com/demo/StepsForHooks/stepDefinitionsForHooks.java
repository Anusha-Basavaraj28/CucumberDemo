package com.demo.StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionsForHooks {
	
	WebDriver driver;
	
	//@Before(order = 1) // this will executes before every scenario
	@Before(value="@smoke",order = 1)
	public void browserSetUp() {
		System.out.println("I am in browserSetUp");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	
	@Before(order = 0)
	public void setUp2() {
		System.out.println("I am in setUp2");
	}
	
	@After(order = 1) //// this will executes after every scenario
	public void tearDown() {
		System.out.println("I am in tearDown");
		driver.close();
	}
	@After(order = 2)
	public void teatDown2() {
		System.out.println("I am in teatDown2");
	}
	@BeforeStep // this will executes before every Steps
	public void beforeSteps() {
		System.out.println("I am in beforeSteps");
		
	}
	@AfterStep // this will executes after every steps
	public void afterSteps() {
		System.out.println("I am in afterSteps");
		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	   
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
	}

	@And("clicks on login page")
	public void clicks_on_login_page() {
	    
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	    
	}



}
