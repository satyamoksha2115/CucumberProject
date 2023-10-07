package Snippers;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutLine extends Utility{

@Given("user enter the adactin url")
public void user_enter_the_adactin_url() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
}

@When("user enter the username {string}")
public void user_enter_the_username(String string) {
	Utility.findElementById("username").sendKeys(string);
}

@When("useer enter the password {string}")
public void useer_enter_the_password(String string) {
	Utility.findElementById("password").sendKeys(string);
}

@Then("user login in th the adactin home page")
public void user_login_in_th_the_adactin_home_page() {
	Utility.onClick(Utility.findElementById("login"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement title=Utility.findElementByXpath("//td[contains(text(),\"Welcome to Adactin Group of Hotels\")]");
	wait.until(ExpectedConditions.visibilityOf(title));
	String title1=Utility.findElementByXpath("//td[contains(text(),\"Welcome to Adactin Group of Hotels\")]").getText();
	Assert.assertEquals(title1,"Welcome to Adactin Group of Hotels");
	driver.close();
}

@When("user enter the username as {string}")
public void user_enter_the_username_as(String string) {
	Utility.findElementById("username").sendKeys(string);
}

@When("user enter the password as {string}")
public void user_enter_the_password_as(String string) {
	Utility.findElementById("password").sendKeys(string);
}

@Then("user login in to the adactin home page")
public void user_login_in_to_the_adactin_home_page() {
	Utility.onClick(Utility.findElementById("login"));
}
}
