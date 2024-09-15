package project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import static activities.ActionsBase.doSwipe;
import static org.testng.Assert.assertEquals;
public class Activity4 {

	AndroidDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		 UiAutomator2Options caps= new UiAutomator2Options().
			       setPlatformName("Android").
			       setAutomationName("UiAutomator2").
			       setAppPackage("com.android.chrome").
			       setAppActivity("com.google.android.apps.chrome.Main").
			       noReset();

			       URL serverURL=new URI("http://localhost:4723/").toURL();
			       driver= new AndroidDriver(serverURL,caps);
			       wait= new WebDriverWait(driver,Duration.ofSeconds(20));
			       
			       driver.get("https://v1.training-support.net/selenium");
	}
	
	@Test
	public void webAppTest() {
		Dimension dims = driver.manage().window().getSize();
		Point start=new Point((int)(dims.getWidth()*0.5),(int)(dims.getHeight()*0.85));
		Point end=new Point((int)(dims.getWidth()*0.5),(int)(dims.getHeight()*0.6));
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text=\"Get Started!\"]")));
		
		doSwipe(driver,start,end,60);
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.view.View[@content-desc=\"To-Do List  Elements get added at run time\"]/android.view.View"))).click();
		
		WebElement addtaskInput= driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Todo List\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		
		WebElement addtaskButton= driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Add Task\"]"));
		
		addtaskInput.sendKeys("addtaskInput");
		addtaskButton.click();
		addtaskInput.sendKeys("Get number of tasks");
		addtaskButton.click();
		addtaskInput.sendKeys("Clear the list");
		addtaskButton.click();
		
		List<WebElement> tasks=driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.view.View[2]//android.widget.TextView"));
		for(WebElement task:tasks) {
			task.click();
		}
		
		driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Todo List\"]/android.view.View/android.view.View/android.view.View[3]")).click();
		
		tasks=driver.findElements(AppiumBy.xpath("//android.view.View/android.view.View/android.view.View[2]//android.widget.TextView"));
		Assert.assertEquals(tasks.size(), 0);
	}
}
