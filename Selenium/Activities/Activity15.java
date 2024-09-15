package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
         driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
	     System.out.println("The title is :"+driver.getTitle());
	     driver.findElement(By.xpath( "//input[starts-with(@class,\"username\")]")).sendKeys("admin");
	     driver.findElement(By.xpath( " //input[starts-with(@class,\"password\")]")).sendKeys("password");
	     driver.findElement(By.xpath("//input[starts-with(@class,\"password\")]/following::button[1]")).click();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#action-confirmation")));
	     System.out.println("The login message is :"+driver.findElement(By.cssSelector("#action-confirmation")).getText());
	     driver.quit();
	}

}
