package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
=======
import org.testng.annotations.Test;

>>>>>>> 3657b86b4d4b63d6e2521b365d135b1c5e4bdef9
import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileLaunch {

// in order to start appium 	
	/*
	 * need to install android studio and set path 1> need to install nodejs and
	 * then install appium via command line : npm install -g appium@next 2>then
	 * install uiautomator -> appium driver install uiautomator2
	 * 
	 * 
	 */
	@Test
	public void MobileTest() throws MalformedURLException, InterruptedException {

		// below are code to start server
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\praja\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();

		/*
		 * below Parameter we have to pass in Appium Inspector "appium:platformName":
		 * "android", "appium:app":
		 * "//Users//rajatkumarprajapati//eclipse-workspace//MobileTestingBasic//src//main//java//resource//ApiDemos-debug.apk",
		 * "appium:deviceName": "RajatPhone", "appium:automationName": "UIAutomator2"
		 */

		// below codes are to start browser or app
		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below
<<<<<<< HEAD
		options.setUdid("emulator-5554");
		//options.setDeviceName("Pixel 3 XL");
		//give the path where app is stored
		options.setApp("C:\\Users\\praja\\eclipse-workspace\\MobileTesting\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		//appium supports on ly id, accessibilty id, classname,androidUIAutomator
		//x path -> By.xpath or AppiumBy.xpath
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']")).click();
		
		//driver.findElement(AppiumBy.accessibilityId("")).click();
		WebElement element=driver.findElement(AppiumBy.accessibilityId("Cloning"));
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
		
=======
		options.setDeviceName("RajatPhone");
		// give the path where app is stored
		options.setApp(
				"//Users//rajatkumarprajapati//eclipse-workspace//MobileTestingBasic//src//main//java//resource//ApiDemos-debug.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

		// appium supports on ly id, accessibilty id, classname,androidUIAutomator
		// x path -> By.xpath or AppiumBy.xpath
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();

		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Cloning")).click();

		// driver.findElement(AppiumBy.accessibilityId("")).click();

>>>>>>> 3657b86b4d4b63d6e2521b365d135b1c5e4bdef9
		Thread.sleep(10000);
		driver.quit();
//		service.stop();

	}
}
