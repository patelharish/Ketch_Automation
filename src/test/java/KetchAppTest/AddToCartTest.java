package KetchAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AddToCartTest extends BaseTest {

	@Test
	public void addToCart() {
		
		log = LoggerFactory.getLogger(AddToCartTest.class);
		
		log.info("clicking on allow notification...");
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
				.click();
		log.info("clicking on shop by men category...");
		WebElement shopforman = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(17)")));
		shopforman.click();
		
		log.info("clicking on first product of plp...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)"))).click();
		
		log.info("clicking on Add to Cart button...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("0ADD TO CART"))).click();
		
		log.info("select any size...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("new UiSelector().text(\"30\")"))).click();
		
		log.info("again clicking on Add to Cart button...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"ADD TO CART\"]"))).click();
		
		log.info("clicking on cart icon...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"))).click();
		
		String pricedetails = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"PRICE DETAILS (1 items)\")"))).getText();
		log.info("verify on cart page message...");
		Assert.assertTrue(pricedetails.contains("PRICE DETAILS (1 items)"));
	}
}
