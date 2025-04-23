package IOSUtil;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IosSliding extends IosLaunchBaseTest {

	@Test
	public void IOSBasicTest() throws InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Sliders")).click();

		// Handling Slider just need to sendkeys value in element
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`value == \"50%\"`][1]")).sendKeys("0.1");

		Thread.sleep(3000);

	}

}
