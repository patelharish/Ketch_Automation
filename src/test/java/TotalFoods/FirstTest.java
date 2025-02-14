package TotalFoods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import KetchAppTest.BaseTest;
import io.appium.java_client.AppiumBy;

public class FirstTest extends BaseTest{

	@Test
	public void demo() throws InterruptedException {
		
     	log = LoggerFactory.getLogger(FirstTest.class);
		WebElement el = driver.findElement(By.className("android.widget.EditText"));
		log.info("clicking on pincode input box...");
		el.click();
		log.info("Entering pincode...");
		el.sendKeys("700001");
		
		Thread.sleep(3000);
		log.info("select address...");
		driver.findElement(AppiumBy.accessibilityId("700001, Kolkata, West Bengal 700001, India")).click();
		
		log.info("clicking on continue button...");
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")")).click();
		Thread.sleep(3000);
		log.info("clicking on any home product category...");
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)")).click();
		
		log.info("clicking on add to cart button...");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(40)")).click();
		
		log.info("clicking on cart button...");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)")).click();
		log.info("maximizing added product quantity...");
		Thread.sleep(3000);
		WebElement maxQuantity = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"+\")"));
		maxQuantity.click();
		maxQuantity.click();
		log.info("clicking on continue button...");
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
	}
}
