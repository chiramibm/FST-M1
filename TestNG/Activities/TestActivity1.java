package activities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://training-support.net");
	}
	
	@Test(priority = 1)
	public void homePageTest() {
		Assert.assertEquals(driver.getTitle(), "Training Support");
	}
	
	 @Test(priority = 2)
	    public void aboutPageTest() {
	        // Assert page title
	        Assert.assertEquals(driver.getTitle(), "About Training Support");
	    }
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
