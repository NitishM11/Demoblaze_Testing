package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import factoryQA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;


public class HomepageSteps {

	private HomePage homepage = new HomePage(DriverFactory.getDriver());

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		DriverFactory.getDriver().get("https://www.demoblaze.com/index.html");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expextedTitle) {
		String title = homepage.getHomepageTitle();
		System.out.println("Homepage title is " + title);
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

	@Then("user clicks on Contact_button")
	public void user_clicks_on_contact_button() {
		homepage.clickOnContact();
	}

	@Then("Contact popup should be displayed with title {string}")
	public void contact_popup_should_be_displayed_with_title(String expected_title) {
		if (homepage.verifyContactPopupIsDisplayed() == true) {
			System.out.println("Expected title : " + expected_title);
			System.out.println("Actual title : " + homepage.getTitleOfContactPopup());
		} else
			System.out.println("Contact popup is not displayed");
	}

	@Then("Contact popup should be displayed with Send message button and Close button")
	public void contact_popup_should_be_displayed_with_send_message_button_and_close_button() {
		if (homepage.verifyCloseButtonIsDisplayed() == true) {
			System.out.println("Close button is displayed");
		} else
			System.out.println("Close button is not displayed");
		if (homepage.verifySendMessageIsDisplayed() == true) {
			System.out.println("Send Message button is displayed");
		} else
			System.out.println("Send Messange button is not displayed");
	}

	@Then("user clicks on About_us button")
	public void user_clicks_on_about_us_button() {
		homepage.clickOnAbout_us();
	}

	@Then("About_us popup should be displayed with title {string}")
	public void about_us_popup_should_be_displayed_with_title(String expected_Title) {
		if (homepage.verifyAbout_usPopupIsDisplayed() == true) {
			assertEquals(expected_Title, homepage.getTitleOfAbout_usPopup());
			System.out.println("Expected title = " + expected_Title);
			System.out.println("Actaul title = " + homepage.getTitleOfAbout_usPopup());
		} else
			System.out.println("About_us popup is not displayed");

	}

	@Then("About_us popup should be displayed with a video and Close button")
	public void about_us_popup_should_be_displayed_with_a_video_and_close_button() {
		if (homepage.verifyAbout_usVideoIsDisplayed() == homepage.verifyAbout_usCloseButtonIsDisplayed() == true) {
			System.out.println("About_us video and close button are displayed");
		} else
			System.out.println("About_us video and close button are not displayed");

	}

	@Then("user clicks on Sign_up button")
	public void user_clicks_on_sign_up_button() {
		homepage.clickOnSign_up();
	}

	@Then("Sign_up popup should be displayed with title {string}")
	public void sign_up_popup_should_be_displayed_with_title(String expected_title) {
		if (homepage.verifySign_upPopupIsDisplayed() == true) {
			assertEquals(expected_title, homepage.getTitleOfSign_upPopup());
			System.out.println("Actual title : " + expected_title);
			System.out.println("Expexted title : " + homepage.getTitleOfSign_upPopup());
		} else
			System.out.println("Sign_up popup is not displayed");
	}

	@Then("Sign_up popup should be displayed with a Sign_up and Close button")
	public void sign_up_popup_should_be_displayed_with_a_sign_up_and_close_button() {
		assertEquals(homepage.verifySign_upCloseButtonIsDisplayed(),
				homepage.verifySign_upButtonIsDisplayedinSign_upPopup(), "Sign_up and Close Button are not displayed");
		System.out.println(homepage.verifySign_upCloseButtonIsDisplayed());
		System.out.println(homepage.verifySign_upButtonIsDisplayedinSign_upPopup());
	}

	@Then("Number of items shown on homepage should be {int}")
	public void number_of_items_shown_on_homepage_should_be(Integer ExpectedNumberOfItems) {
		int numberOfItemsVisible = homepage.listOfProducts().size();
		if(ExpectedNumberOfItems==numberOfItemsVisible) {
			System.out.println("Number of visible items : "+numberOfItemsVisible);
		}

	}

	@Then("Previous and Next button should be displayed")
	public void previous_and_next_button_should_be_displayed() {
		assertEquals(true,
				homepage.previousButtonDisplayed(), "Previuos Button is not displayed");
		assertEquals(true,
				homepage.nextButtonDisplayed(), "Previuos Button is not displayed");
		}

	@Then("Filter buttons for Catogories,Phones,Laptops and Monitors should be displayed")
	public void filter_buttons_for_catogories_phones_laptops_and_monitors_should_be_displayed() {
		assertEquals(true,
				homepage.catogoriesButtonDisplayed(), "Catogories Button is not displayed");
		assertEquals(true,
				homepage.phonesButtonDisplayed(), "Catogories Button is not displayed");
	}

}
