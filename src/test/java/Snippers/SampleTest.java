package Snippers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTest {
	@Given("enter  the Url")
	public void enter_the_url() {
		System.out.println("Url");
	}

	@When("enter the username")
	public void enter_the_username() {
		System.out.println("Username");
	}

	@When("enter the password")
	public void enter_the_password() {
		System.out.println("Password");
	}

	@Then("click the login")
	public void click_the_login() {
		System.out.println("Login succesful");
	}
}
