package IOSUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IosLaunchBaseTest {
	public static IOSDriver driver;

	@BeforeClass
	public void IosInitiateDriver() {

		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhone 16 Pro");
		options.setApp("/Users/rajatkumarprajapati/Documents/UIKitCatalog.app");
		// options.setPlatformVersion("18.2");
		// Appium--WebDriver Agent -> IOS Apps
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));

		try {
			driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
