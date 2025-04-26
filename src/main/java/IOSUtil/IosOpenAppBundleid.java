package IOSUtil;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IosOpenAppBundleid extends IosLaunchBaseTest {

	@Test
	public void PhotoSlideDemo() throws InterruptedException {

		Map<String, Object> params = new HashMap<>();

		params.put("bundleId", "com.apple.mobileslideshow");
		driver.executeScript("mobile:launchApp", params);

		driver.findElement(AppiumBy.accessibilityId("all_photos_grid")).click();
		Thread.sleep(3000);
	}

}
