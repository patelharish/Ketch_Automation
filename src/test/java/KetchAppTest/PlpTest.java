package KetchAppTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
				WebElement shirts = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"SHIRT\")")));
				//Thread.sleep(3000);
				shirts.click();
				
				Thread.sleep(3000);
				String actualTitle  = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Shirts For Men\")")).getText(); 
				String expectedTitle = "Shirts For Men";
				
				Assert.assertEquals(actualTitle, expectedTitle);
				
				WebElement sortby = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"SORT BY\")")));
				sortby.click();
				
				WebElement lowtohigh = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOW TO HIGH\")")));
				lowtohigh.click();
				
				
	}
}
