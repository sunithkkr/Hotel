package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	
	static WebDriver driver;
	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunith\\eclipse-workspace\\HotelBooking\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void openBrowser(String url) {
		driver.get(url);
	}
	public static void mazimize() {
		driver.manage().window().maximize();
	}
	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}

}
