package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		Thread.sleep(2000);
		driver.getTitle();
		System.out.println("The no of columns :" + driver.findElements(By.xpath("//table/thead/tr/th")).size());
		System.out.println("The no of rows :" + driver.findElements(By.xpath("//table/tbody/tr")).size());
		System.out.println("The third row elements are");
		for (WebElement e : driver.findElements(By.xpath("//table/tbody/tr[3]/td"))) {
			System.out.println(e.getText());
		}

		System.out.println("The second row second column is :"
				+ driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
		driver.close();

	}

}
