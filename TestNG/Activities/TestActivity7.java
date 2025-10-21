package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://training-support.net/webelements/login-form");
	}

	@Test(priority = 1)
	public void homePageTest() {
		Assert.assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	
	@DataProvider(name="invalidCredentials")
public Object[][] creds(){
		return new Object[][] {
			{"admin","invalidPassWord"},
			{"invalidUser","password"},
			{"admin","!@#$%^&*()"},
			{"DELETE TABLE USERS","password"}
		};
		
	}
	@Test(priority = 2,dataProvider = "invalidCredentials")
	public void invalidLoginTest(String userName,String password) {
		WebElement userNameField= driver.findElement(By.id("username"));
		WebElement passWordField= driver.findElement(By.id("password"));
		WebElement submitButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		userNameField.clear();
		passWordField.clear();
		userNameField.sendKeys(userName);
		passWordField.sendKeys(password);
		submitButton.click();
		String message= driver.findElement(By.id("subheading")).getText();  
		Assert.assertEquals(message, "Invalid credentials");
	}
	
	@Test(priority = 3)
	public void validLoginTest() {
		WebElement userNameField= driver.findElement(By.id("username"));
		WebElement passWordField= driver.findElement(By.id("password"));
		WebElement submitButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		userNameField.clear();
		passWordField.clear();
		userNameField.sendKeys("admin");
		passWordField.sendKeys("password");
		submitButton.click();
		String message= driver.findElement(By.cssSelector("h2.text-gray-800")).getText();
		Assert.assertEquals(message, "Welcome Back, Admin!");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
