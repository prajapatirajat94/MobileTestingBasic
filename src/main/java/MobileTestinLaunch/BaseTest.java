package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

	public static AndroidDriver driver;
	
	
	@BeforeTest
	public void initiate_Appium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		// device name give below

		options.setUdid("emulator-5554");
		//options.setDeviceName("Pixel 3 XL");
		//give the path where app is stored
		options.setApp("C:\\Users\\praja\\eclipse-workspace\\MobileTesting\\src\\main\\java\\resource\\ApiDemos-debug.apk");
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		
	}
}
