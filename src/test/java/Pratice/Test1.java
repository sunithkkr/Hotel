package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunith\\eclipse-workspace\\HotelBooking\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="datasample")
	public void tc1(String email, String pass) {
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
	@DataProvider(name="datasample")
	public Object[][] data() {
		return new Object[][] {
			{"sunith","test"},
			{"vicky","testing"},
			{"naresh","test123"}
		};
		

	}

	
}
