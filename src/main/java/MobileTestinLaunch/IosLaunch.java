package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

public class IosLaunch {


	public static void main(String[] args) {
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("");
		option.setApp("");
		
		try {
			IOSDriver driver = new IOSDriver(new URL(""),option);
			driver.findElement(By.xpath(null));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
