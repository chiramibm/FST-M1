package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/");
		System.out.println("The page title is "+driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();
		System.out.println("The new page title is "+driver.getTitle());
		
driver.quit();

	}

}
