package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileLaunchScrollDemo extends AndroidBaseTest {
    @Test
	public  void ScrolleGesture() throws MalformedURLException {
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}

}
