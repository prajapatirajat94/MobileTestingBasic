package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileLaunchScrollDemo {

	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below
		
		options.setUdid("emulator-5554");
		//options.setDeviceName("Pixel 3 XL");
		//give the path where app is stored
		options.setApp("C:\\Users\\praja\\eclipse-workspace\\MobileTesting\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}

}
