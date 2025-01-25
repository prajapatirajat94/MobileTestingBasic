package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileLaunchLongPressGesture {

	public static void main(String[]args) throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below
		options.setUdid("emulator-5554");
		//options.setDeviceName("Pixel 3 XL");
		//give the path where app is stored
		options.setApp("C:\\Users\\praja\\eclipse-workspace\\MobileTesting\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		
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
	
	js.executeScript("mobile:LongClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));
	}
	
	
	
	
}
