package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileLaunchLongPressGesture extends BaseTest {

	@Test
	public void LongPressGesture () throws MalformedURLException {
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		
		WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		//android.widget.TextView[@text="People Names"]
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),"duration",5000
		));
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample action\"]")).click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//js.executeScript("mobile:LongClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
	}
	
	
	
	
}
