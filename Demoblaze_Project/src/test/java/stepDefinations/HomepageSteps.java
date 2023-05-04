package stepDefinations;

import org.junit.Assert;


import factoryQA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
public class HomepageSteps {
	
	private HomePage homepage  = new HomePage(DriverFactory.getDriver());

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		DriverFactory.getDriver().get("https://www.demoblaze.com/index.html");
	}
	@Then("page title should be {string}")
	public void page_title_should_be(String expextedTitle) {
		String title = homepage.getHomepageTitle();
		System.out.println("Homepage title is "+title);
		Assert.assertTrue(title.contains(expextedTitle));
	}

	@Given("user is on Home_page")
	public void user_is_on_Home_page() {
		DriverFactory.getDriver().get("https://www.demoblaze.com/index.html");
		
	}

	@When("user clicks on Log in button")
	public void user_clicks_on_log_in_button() {
		homepage.clickOnLogin();
	}

	@Then("user get login popup window")
	public void user_get_login_popup_window() {
		
	}

	@Then("user enters username {string}")
	public void user_enters_username(String name) {
		homepage.enterUserName(name);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String pwd) {
		homepage.enterPassword(pwd);
	}

	@Then("user clicks on Login button")
	public void user_clicks_on_login_button() {
		homepage.clickOnFinalLogin();
	}

	
	

}
