package IOSUtil;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSScrollTest extends IosLaunchBaseTest {

	@Test
	public void ScrollToIOs() throws InterruptedException {

		WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
		Map<String, Object> ScrollEle = new HashMap<>();
		ScrollEle.put("direction", "down");
		ScrollEle.put("element", ((RemoteWebElement) ele).getId());

		driver.executeScript("mobile:scroll", ScrollEle);

		driver.findElement(AppiumBy.accessibilityId("Web View")).click();

		Thread.sleep(3000);

	}

}
