package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net");
		System.out.println("Home page title: " + driver.getTitle());
		driver.quit();
	}

}
