package pages;

import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private WebDriver driver;

	// By locators
	private By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	private By Cart = By.xpath("//*[@id=\"cartur\"]");
	private By Name = By.xpath("//*[@id=\"name\"]");
	private By Country = By.xpath("//*[@id=\"country\"]");
	private By Credit_card = By.xpath("//*[@id=\"card\"]");
	private By Month = By.xpath("//*[@id=\"month\"]");
	private By Year = By.xpath("//*[@id=\"year\"]");
	private By City = By.xpath("//*[@id=\"city\"]");
	private By PurchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");

	// Constructor of the page class
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	// Page actions
	public boolean verifyPlaceOrderButton() {
		return driver.findElement(placeOrderButton).isDisplayed();
	}

	public void clickOnPlaceOrder() {
		driver.findElement(placeOrderButton).click();
	}

	public void clickOnPurchase() {
		driver.findElement(PurchaseButton).click();
	}

	public void enterCustomerDetails(String Name, String Country, String City, String Credit_Card, String Month,
			String Year) {
		driver.findElement(this.Name).sendKeys(Name);
		driver.findElement(this.Country).sendKeys(Country);
		driver.findElement(this.City).sendKeys(City);
		driver.findElement(this.Credit_card).sendKeys(Credit_Card);
		driver.findElement(this.Month).sendKeys(Month);
		driver.findElement(this.Year).sendKeys(Year);

	}

	public boolean confirmationPopupDisplayed() {
		return driver.findElement(By.xpath("/html/body/div[10]")).isDisplayed();
	}

	public String getConfirmationDetails() {
		String Details = driver.findElement(By.xpath("/html/body/div[10]/p")).getText();
				return Details;
	}
}
