package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
	    driver.get("https://v1.training-support.net/selenium/login-form");
	    System.out.println("The title is :"+driver.getTitle());
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("Password")).sendKeys("password");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.quit();
	    
	    
	}
}
