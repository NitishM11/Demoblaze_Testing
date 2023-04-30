package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	// By locators
	private By username = By.id("loginusername");
	private By password = By.id("loginpassword");
	private By loginButton = By.id("login2");
	private By login = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	// COnstructor of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Page actions
	public String getHomepageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
		
	}
	
	public void enterUserName(String username) {
		
		driver.findElement(this.username).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(this.password).sendKeys(pwd);
	}
	
	public void clickOnFinalLogin() {
		driver.findElement(login).click();
		
	}
	
	
}
