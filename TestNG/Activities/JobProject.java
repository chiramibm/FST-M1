package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JobProject {

	WebDriver driver;

	@Test
	public void titleVerification() {

		driver.get("https://alchemy.hguy.co/jobs");
		String title = driver.getTitle();
		assertEquals(title, "Alchemy Jobs – Job Board Application", "Invalid page title");
		driver.quit();
	}

	@Test
	public void headingVerfication() {

		driver.get("https://alchemy.hguy.co/jobs");
		String heading = driver.findElement(By.cssSelector("h1[class='entry-title']")).getText();
		assertEquals(heading, "Welcome to Alchemy Jobs", "Wrong heading");
		driver.quit();
	}

	@Test
	public void headerImageURL() {
		driver.get("https://alchemy.hguy.co/jobs");
		String imageurl = driver.findElement(By.xpath("//header[contains(@class,'entry-header')]/div/img"))
				.getAttribute("src");

		System.out.println(" Header Image URL is :" + imageurl);
		driver.quit();
	}

	@Test
	public void secondHeading() {
		driver.get("https://alchemy.hguy.co/jobs");
		String secondHeading = driver.findElement(By.xpath("//h2")).getText();
			assertEquals(secondHeading, "Quia quis non","Invalid second heading");
			driver.quit();
	}

	public void navigation() {
		driver.get("https://alchemy.hguy.co/jobs");
		driver.findElement(By.linkText("https://alchemy.hguy.co/jobs/jobs/")).click();
		String jobTitle = driver.getTitle();
			assertEquals(jobTitle, "Jobs – Alchemy Jobs","Invalid Navigated page title");
			driver.quit();

	}

}
