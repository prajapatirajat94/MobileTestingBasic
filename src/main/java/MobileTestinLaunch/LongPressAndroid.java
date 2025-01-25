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

public class LongPressAndroid {

	@Test
	public void LongPress() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below
		options.setDeviceName("RajatPhone");
		// give the path where app is stored
		options.setApp(
				"//Users//rajatkumarprajapati//eclipse-workspace//MobileTestingBasic//src//main//java//resource//ApiDemos-debug.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

		WebElement element = driver.findElement(By.xpath(""));
		// 1.by using below method we can long click

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 2000));

		// TouchAction Class has been depricated so we can not use it

	}

}
