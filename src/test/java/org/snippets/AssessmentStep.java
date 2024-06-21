package org.snippets;

import org.openqa.selenium.WebDriver;

import com.Assessment.Base;
import com.Assessment.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AssessmentStep extends Base{
	
	public WebDriver driver;
	public Pom a1;
	
	@Given("Launch browser and Url")
	public void launch_browser_and_url() {
		driver = browserLaunch(url);
	}
	@Given("Pass the username")
	public void pass_the_username() {
	    a1= new Pom(driver);
	    sendkey(a1.getUsername(), username);
	}
	@Given("Pass the password")
	public void pass_the_password() {
	 a1= new Pom(driver);
	 sendkey(a1.getPw(), pw);
	}
	@Then("click the login")
	public void click_the_login() {
		a1= new Pom(driver);
		click(a1.getLogin());
	   
	}




}
