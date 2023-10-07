package Snippers;

import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSampleExecution extends Utility{
	@Given("user launch the base url")
	public void user_launch_the_base_url() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter the username")
	public void user_enter_the_username() {
		Utility.findElementById("username").sendKeys("SatyaVaniChittelu");
	
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		Utility.textData(Utility.findElementById("password"), "moksha@15");
	}

	@Then("user login the page successfully")
	public void user_login_the_page_successfully() {
		Utility.onClick(Utility.findElementById("login"));
	}

	@Given("User launch the base url.")
	public void user_launch_the_base_url1() {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter the invalid username")
	public void user_enter_the_invalid_username() {
		Utility.findElementById("username").sendKeys("SatyaVani");
	}

	@When("user enter the invalid password")
	public void user_enter_the_invalid_password() {
		Utility.textData(Utility.findElementById("password"), "moksha@15");
	}

	@Then("user login unsuccessfully")
	public void user_login_unsuccessfully() {
		Utility.onClick(Utility.findElementById("login"));
	}

}
