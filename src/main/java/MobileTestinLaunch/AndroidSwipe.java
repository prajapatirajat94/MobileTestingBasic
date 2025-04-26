package MobileTestinLaunch;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AndroidSwipe extends AndroidBaseTest {

	@Test
	public void SwipeInApp() {

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();

		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

		WebElement firstimage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));

		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("elementId", ((RemoteWebElement) firstimage).getId());
		params.put("direction", "left");
		params.put("percent", 0.75);
		driver.executeScript("mobile: swipeGesture", params);

//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
//				((RemoteWebElement) firstimage).getId(), "direction", "left", "percent", 0.75));

	}

}
