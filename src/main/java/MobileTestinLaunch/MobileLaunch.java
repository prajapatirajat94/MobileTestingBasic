package MobileTestinLaunch;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileLaunch {

	
	
// in order to start appium 	
/*
 * need to install android studio and set path
 * 1> need to install nodejs and then install appium via command line : npm install -g appium@next
 * 2>then install uiautomator -> appium driver install uiautomator2
 * 
 * 
 */
	
	public static void main(String[]args) throws MalformedURLException, InterruptedException {
		
		
		//below are code to start server
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\praja\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		
		//below codes are to start browser or app 
		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below
		options.setDeviceName("Pixel 3 XL");
		//give the path where app is stored
		options.setApp("C:\\Users\\praja\\eclipse-workspace\\MobileTesting\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		
		//appium supports on ly id, accessibilty id, classname,androidUIAutomator
		//x path -> By.xpath or AppiumBy.xpath
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
		
		//driver.findElement(AppiumBy.accessibilityId("")).click();
		
		Thread.sleep(10000);
		driver.quit();
//		service.stop();
		
	}
}
