package Snippers;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAdcatinExecution {
	@Given("user enter the url")
	public void user_enter_the_url() {
		System.out.println("Print Url");
	}

	@When("user enter the username as list")
	public void user_enter_the_username_as_list(DataTable dataTable) {
		List<String> ls= dataTable.asList();
		System.out.println(ls.get(0));
	}

	@When("user enter the password as list")
	public void user_enter_the_password_as_list(DataTable dataTable) {
		List<String> ls= dataTable.asList();
		System.out.println(ls.get(0));
		Assert.assertFalse(false);
	}

	@When("user enter the username as lists")
	public void user_enter_the_username_as_lists(DataTable dataTable) {
		List<List<String>> ls= dataTable.asLists();
		System.out.println(ls.get(1).get(1));
	}

	@When("user enter the password as lists")
	public void user_enter_the_password_as_lists(DataTable dataTable) {
		List<List<String>> ls= dataTable.asLists();
		System.out.println(ls.get(0).get(1));
	}

	@When("user enter the username as map")
	public void user_enter_the_username_as_map(DataTable dataTable) {
		Map<String,String> ls= dataTable.asMap();
		System.out.println(ls.get("usename1"));
	}

	@When("user enter the password as map")
	public void user_enter_the_password_as_map(DataTable dataTable) {
		Map<String,String> ls= dataTable.asMap();
		System.out.println(ls.get("password1"));
	}

	@When("user enter the username as maps")
	public void user_enter_the_username_as_maps(DataTable dataTable) {
		List<Map<String,String>> ls= dataTable.asMaps();
		System.out.println(ls.get(0).get("username"));
	}

	@When("user enter the password as maps")
	public void user_enter_the_password_as_maps(DataTable dataTable) {
		List<Map<String,String>> ls= dataTable.asMaps();
		System.out.println(ls.get(0).get("password"));
}
	@Then("user logged in the page successfully")
	public void user_logged_in_the_page_successfully() {
		System.out.println("login succesfully");
	}

}
