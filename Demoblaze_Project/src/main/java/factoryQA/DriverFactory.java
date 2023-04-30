package factoryQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>(); //for parallel execution of test cases
	//0
	//For initiliaze the THreadLocal on the basis of Given browser
	
	public WebDriver init_driver(String browser) {
		System.out.println("Initialising the driver");
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\NITISH\\git\\Demoblaze_Testing\\Demoblaze_Project\\src\\test\\resources\\updatedBrowser\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Enter correct browser value");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
	
	/*This is used to get the driver with ThreadLocal */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	
	
}
