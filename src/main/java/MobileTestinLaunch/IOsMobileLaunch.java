package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;

public class IOsMobileLaunch {
	public static IOSDriver driver;

	public static void main(String[] args) {

		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("");
		option.setApp("");

		try {
			driver = new IOSDriver(new URL(""), option);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(AppiumBy.iOSNsPredicateString(""));
		driver.findElement(AppiumBy.iOSClassChain(""));

	}

}
