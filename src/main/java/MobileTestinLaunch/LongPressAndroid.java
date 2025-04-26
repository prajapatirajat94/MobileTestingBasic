package MobileTestinLaunch;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPressAndroid extends AndroidBaseTest {

	@Test
	public void LongPress() throws MalformedURLException {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		// 1.by using below method we can long click

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("mobile: longClickGesture",
//				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 2000));

		// 2.W3c Action

		Point point = element.getLocation();
		Dimension dimension = element.getSize();

		int centerx = point.getX() + (dimension.getWidth() / 2);
		int centery = point.getY() + (dimension.getHeight() / 2);

		PointerInput fingure1 = new PointerInput(PointerInput.Kind.TOUCH, "fingure1");
		Sequence sequenece = new Sequence(fingure1, 1);

		sequenece
				.addAction(fingure1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerx, centery));
		sequenece.addAction(fingure1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		sequenece.addAction(new Pause(fingure1, Duration.ofSeconds(2)));
		sequenece.addAction(fingure1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singleton(sequenece));

	}

}
