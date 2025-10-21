package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		Thread.sleep(2000);
		driver.getTitle();
		System.out.println("The no of columns :" + driver.findElements(By.xpath("//table/thead/tr/th")).size());
		System.out.println("The no of rows :" + driver.findElements(By.xpath("//table/tbody/tr")).size());
		System.out.println("The fith row book name pre sort:"
				+ driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		System.out.println("Sorting on price");
		driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
		System.out.println("The fith row book name post sort :"
				+ driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		driver.close();

	}

}
