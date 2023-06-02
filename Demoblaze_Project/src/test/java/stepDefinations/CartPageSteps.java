package stepDefinations;

import static org.testng.Assert.assertEquals;

import factoryQA.DriverFactory;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.CartPage;

public class CartPageSteps {
	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	private CartPage cartPage = new CartPage(DriverFactory.getDriver());

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> credentials = dataTable.asMaps();
		String usrname = credentials.get(0).get("username");
		String pwd = credentials.get(0).get("password");
		DriverFactory.getDriver().get("https://www.demoblaze.com/index.html");
		homepage.doLogin(usrname, pwd);
	}

	@Then("verify user is on Cart page")
	public void verify_user_is_on_cart_page() {
		assertEquals(cartPage.verifyPlaceOrderButton(), true, "user is not on CartPage");
	}

	@Given("Logged into the user account {string}")
	public void logged_into_the_user_account(String string) {
		String expectedUserName = "Welcome " + string;
		homepage.getLoggedInUserName();
	}

	@Then("user clicks on Place_order Button")
	public void user_clicks_on_place_order_button() {
		cartPage.clickOnPlaceOrder();
	}

	@Then("user fills out the details")
	public void user_fills_out_the_details(DataTable dataTable) {
		List<Map<String, String>> customerDetials = dataTable.asMaps();
		String Name = customerDetials.get(0).get("Name");
		String Country = customerDetials.get(0).get("Country");
		String City = customerDetials.get(0).get("City");
		String Credit_Card = customerDetials.get(0).get("Credit_Card");
		String Month = customerDetials.get(0).get("Month");
		String Year = customerDetials.get(0).get("Year");
		cartPage.enterCustomerDetails(Name, Country, City, Credit_Card, Month, Year);
		
	 }

	@Then("clicks on Purchase Button")
	public void clicks_on_purchase_button() {
	cartPage.clickOnPurchase();
	}
	@Then("popup with order details should be displayed")
	public void popup_with_order_details_should_be_displayed() {
		System.out.println(cartPage.confirmationPopupDisplayed());
		System.out.println(cartPage.getConfirmationDetails());
	}

}
