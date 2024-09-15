package demos;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();
         driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("The title of the page is :"+driver.getTitle());
       System.out.println("The 3rd header is:"+driver.findElement(By.xpath("//h3[@id=\"third-header\"]")).getText());
       System.out.println("The 5th Header color is :"+driver.findElement(By.xpath("//h5[contains(text(),\"Fifth header\")]")).getCssValue("color"));
       System.out.println("The class name of Violet color button :"+driver.findElement(By.className("ui violet button")).getAttribute("class"));
       System.out.println("The text of grey color button :"+driver.findElement(By.cssSelector("button.grey")).getText());
       driver.quit();
        
        
	}

}
