package TotalFoods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import KetchAppTest.BaseTest;
import io.appium.java_client.AppiumBy;

public class CartCalculation extends BaseTest {
	
	@Test
	public void cartCalc() throws InterruptedException {
	log = LoggerFactory.getLogger(FirstTest.class);
 	Thread.sleep(4000);
 	WebElement el = driver.findElement(By.className("android.widget.EditText"));
	log.info("clicking on pincode input box...");
	Thread.sleep(3000);
	el.click();
	log.info("Entering pincode...");
	Thread.sleep(3000);
	el.sendKeys("700001");
	
	Thread.sleep(4000);
	log.info("select address...");
	driver.findElement(AppiumBy.accessibilityId("700001, Kolkata, West Bengal 700001, India")).click();
	
	log.info("clicking on continue button...");
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Continue\")")).click();
	Thread.sleep(3000);
	log.info("clicking on any home product category...");
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)")).click();

	log.info("clicking on second product...");
	Thread.sleep(4000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add To Cart\").instance(1)")).click();
	
	log.info("clicking on third product...");
	Thread.sleep(4000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(65)")).click();
	
	log.info("clicking on fourth product...");
	Thread.sleep(4000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(76)")).click();
}
}
