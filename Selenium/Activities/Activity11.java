package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://training-support.net/webelements/dynamic-controls");
		   Thread.sleep(2000);
			driver.getTitle();
driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
WebDriverWait expWait=new WebDriverWait(driver,Duration.ofSeconds(5));
expWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
expWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
driver.findElement(By.id("checkbox")).click();
driver.quit();
	}

}
