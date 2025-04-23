package IOSUtil;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IosLongTouch extends IosLaunchBaseTest {

	@Test
	public void LongTouchIos() throws InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();

		WebElement touchElement = driver
				.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Increment\"`][3]"));

		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {
			Map<String, Object> touchholdMap = new HashMap<String, Object>();

			touchholdMap.put("duration", 0.5);
			touchholdMap.put("element", ((RemoteWebElement) touchElement).getId());

			driver.executeScript("mobile:touchAndHold", touchholdMap);
		}

//		Map<String, Object> touchholdMap = new HashMap<String, Object>();
//
//		touchholdMap.put("duration", 1);
//		touchholdMap.put("element", ((RemoteWebElement) touchElement).getId());
//
//		driver.executeScript("mobile:touchAndHold", touchholdMap);

		Thread.sleep(3000);

	}

}
