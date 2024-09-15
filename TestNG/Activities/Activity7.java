package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
     
@BeforeMethod
public void driverIntiallization() {
	driver=new ChromeDriver();
	driver.get("https://v1.training-support.net/selenium/login-form");
	
}

@DataProvider(name="Authentication")
public static Object[][] credentials(){
	
	return new Object[][] {{"admin","password","Welcome Back, admin"},
			           {"wrongAdming","wrongPassword","Invalid Credentials"}};
}

@Test(dataProvider="Authentication")
public void login(String username,String pwd,String msg)
{
	driver.findElement(By.name("Username")).clear();
	driver.findElement(By.name("Password")).clear();
	driver.findElement(By.name("Username")).sendKeys(username);
	driver.findElement(By.name("Password")).sendKeys(pwd);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	String message=driver.findElement(By.id("action-confirmation")).getText();
	Assert.assertEquals(msg, message);
}

@AfterMethod 
public void close() {
	driver.quit();
}
}
