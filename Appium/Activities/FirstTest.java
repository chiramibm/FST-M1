package examples;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstTest {

	AppiumDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException, URISyntaxException {
       UiAutomator2Options caps= new UiAutomator2Options().
       setPlatformName("Android").
       setAutomationName("UiAutomator2").
       setAppPackage("com.miui.calculator").
       setAppActivity(".cal.CalculatorActivity").
       noReset();

       URL serverURL=new URI("http://localhost:4723/").toURL();
       driver= new AndroidDriver(serverURL,caps);
	}
	
	@Test
	public void additionTest()
	{
		driver.findElement(AppiumBy.id("com.miui.calculator:id/digit_6")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.id("digit_9")).click(); // we just used the id as package name is same
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result= driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
		Assert.assertEquals(result, "= 15");
		
	}
	
	
}
