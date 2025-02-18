package KetchAppTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class PlpTest extends BaseTest{

	@Test
	public void plpfilter() throws InterruptedException  {
		
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
				.click();
		
		//new UiSelector().className("android.widget.ImageView").instance(16)
		//Thread.sleep(3000);
		// driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"TSHIRT\"]/android.view.ViewGroup/android.widget.ImageView")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement shirts = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"SHIRT\")")));
				//Thread.sleep(3000);
				shirts.click();
				
				WebElement sortby = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"SORT BY\")")));
				sortby.click();
				
				WebElement lowtohigh = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOW TO HIGH\")")));
				lowtohigh.click();
   }
}
