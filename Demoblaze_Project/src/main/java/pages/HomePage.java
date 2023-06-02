package pages;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import org.openqa.selenium.Alert;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	// By locators
	private By username = By.id("loginusername");
	private By password = By.id("loginpassword");
	private By loginButton = By.id("login2");
	private By login = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	private By contactButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
	private By closeButtonOnContactPopup = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");
	private By sendMessageButtonOnContactPopup = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
	private By about_usButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
	private By sign_upButton = By.xpath("//*[@id=\"signin2\"]");
	private By previousButton = By.xpath("//*[@id=\"prev2\"]");
	private By nextButton = By.xpath("//*[@id=\"next2\"]");
	private By categorisButton = By.xpath("//div//a[contains(text(),'CATEGORIES')]");
	private By phonesButton = By.xpath("//div//a[contains(text(),'Phones')]");
	private By laptopsButton = By.name("/html/body/div[5]/div/div[1]/div/a[3]");
	private By monitorsButton = By.name("//div//a[contains(text(),'Monitors')]");
	private By usernameForSignUp = By.xpath("//*[@id=\"sign-username\"]");
	private By passwordForSignUp = By.xpath("//*[@id=\"sign-password\"]");
	private By newUserSignUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	private By cartButton = By.xpath("//*[@id=\"cartur\"]");
	
	// Constructor of the page class
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
	public void enterUserName(String name) {
		driver.findElement(this.username).sendKeys(name);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(this.password).sendKeys(pwd);
	}
	
	public void clickOnFinalLogin() {
		driver.findElement(login).click();
	}
	public CartPage clickOnCartButton() {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		return new CartPage(driver);
	}
	public void clickOnContact() {
		driver.findElement(contactButton).click();
	}
	public void clickOnAbout_us() {
		driver.findElement(about_usButton).click();
	}
	public void clickOnSign_up() {
		driver.findElement(sign_upButton).click();
		
	}
	public void clickOnPhones() {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div//a[contains(text(),'Phones')]")).click();
	}
	public boolean verifyContactPopupIsDisplayed() {
		boolean verifyContactPopupIsDisplayed=driver.findElement(By.xpath("//*[@id=\"exampleModalLabel\"]")).isEnabled();
		return verifyContactPopupIsDisplayed;
	}
	public String getTitleOfContactPopup() {
		String titleOfContactPopup = driver.findElement(By.xpath("//*[@id=\"exampleModalLabel\"]")).getText();
		return titleOfContactPopup;
	}
	public boolean verifyCloseButtonIsDisplayed() {
		boolean verifyCloseButtonIsDisplayed=driver.findElement(closeButtonOnContactPopup).isDisplayed();
		return verifyCloseButtonIsDisplayed;
	}
	public boolean verifySendMessageIsDisplayed() {
		boolean verifySendMessageIsDisplayed=driver.findElement(sendMessageButtonOnContactPopup).isDisplayed();
		return verifySendMessageIsDisplayed;
	}
	public boolean verifyAbout_usPopupIsDisplayed() {
		boolean verifyAbout_usPopupIsDisplayed = driver.findElement(By.xpath("//*[@id=\"videoModalLabel\"]")).isDisplayed();
		return  verifyAbout_usPopupIsDisplayed;
	}
	public String getTitleOfAbout_usPopup() {
		String titleOfAbout_usPopup = driver.findElement(By.xpath("//*[@id=\"videoModalLabel\"]")).getText();
		return  titleOfAbout_usPopup;
	}
	public boolean verifyAbout_usVideoIsDisplayed() {
		boolean verifyAbout_usVideoIsDisplayed = driver.findElement(By.xpath("//*[@id=\"example-video_html5_api\"]")).isEnabled();
		return  verifyAbout_usVideoIsDisplayed;
	}
	public boolean verifyAbout_usCloseButtonIsDisplayed() {
		boolean verifyAbout_usCloseButtonIsDisplayed = driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).isEnabled();
		return  verifyAbout_usCloseButtonIsDisplayed;
	}
	public boolean verifySign_upPopupIsDisplayed() {
		boolean verifySign_upPopupIsDisplayed = driver.findElement(By.xpath("//*[@id=\"signInModalLabel\"]")).isEnabled();
		return verifySign_upPopupIsDisplayed;
	}
	public String getTitleOfSign_upPopup() {
	String titleOfSignupPopup =  driver.findElement(By.id("signInModalLabel")).getText();
	return titleOfSignupPopup;
	}
	public boolean verifySign_upCloseButtonIsDisplayed() {
		boolean Sign_upCloseButtonIsDisplayed = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")).isDisplayed();
		return Sign_upCloseButtonIsDisplayed;
	}
	public boolean verifySign_upButtonIsDisplayedinSign_upPopup() {
		boolean Sign_upButtonIsDisplayedinSign_upPopup = driver.findElement(newUserSignUpButton).isDisplayed();
		return Sign_upButtonIsDisplayedinSign_upPopup;
	}
	public List<WebElement> listOfProducts() {
		List<WebElement> elementList = driver.findElements(By.xpath("//div//div[@class='card h-100']"));
		return elementList;
	}
	public boolean previousButtonDisplayed() {
		boolean previousButtonDisplayed = driver.findElement(previousButton).isDisplayed();
		return previousButtonDisplayed;
	}
	public boolean nextButtonDisplayed() {
		boolean previousButtonDisplayed = driver.findElement(nextButton).isDisplayed();
		return previousButtonDisplayed;
	}
	
	public boolean catogoriesButtonDisplayed() {
		boolean catogoriesButtonDisplayed = driver.findElement(categorisButton).isDisplayed();
		return catogoriesButtonDisplayed;
	}
	public boolean phonesButtonDisplayed() {
		boolean phonesButtonDisplayed = driver.findElement(phonesButton).isDisplayed();
		return phonesButtonDisplayed;
	}
	public boolean laptopsButtonDisplayed() {
		boolean laptopsButtonDisplayed = driver.findElement(laptopsButton).isDisplayed();
		return laptopsButtonDisplayed;
	}
	public boolean monitorsButtonDisplayed() {
		boolean monitorsButtonDisplayed = driver.findElement(monitorsButton).isDisplayed();
		return monitorsButtonDisplayed;
	}
    private static String newusername;
    private static String newpassword;

    public String generateNewPassword() {
        String basePassword = "password";
        String uniqueIdentifier = UUID.randomUUID().toString().substring(0, 4);
        newpassword = basePassword + uniqueIdentifier;
        return newpassword;
    } 
    public String generateNewUserName() {
    	  String baseUsername = "user";
          String uniqueIdentifier = UUID.randomUUID().toString().substring(0, 4);
          newusername = baseUsername + uniqueIdentifier;
          return newusername;	
    }
	public void enterNewUsername() {
	 String usrname = generateNewUserName();
		driver.findElement(usernameForSignUp).sendKeys(usrname);
		System.out.println(newusername);
	}
	public void enterNewPassword() {
		String pwd = generateNewPassword();
		driver.findElement(passwordForSignUp).sendKeys(pwd);
		System.out.println(newpassword);
	}
	public void clickOnNewUserSign_up() {
		driver.findElement(newUserSignUpButton).click();
	}
	public void enterNewCredentials() {
		driver.findElement(username).sendKeys(newusername);
		driver.findElement(password).sendKeys(newpassword);	
	}
	public void doLogin(String usrname, String pwd) {
		driver.findElement(By.id("login2")).click();
		driver.findElement(username).sendKeys(usrname);
		
		driver.findElement(password).sendKeys(pwd);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}
	public String getLoggedInUserName() {
		String nameOfUser = driver.findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
		return nameOfUser;
	}
	public void clickOnProduct() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		//driver.navigate().refresh();
		//driver.findElement(By.xpath("//div//div//a[@onclick=\"addToCart(1)\"]")).click();
	}
	public String getTextFromAlert() {
		return driver.switchTo().alert().getText();
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	
}
	


	
	
	

	

