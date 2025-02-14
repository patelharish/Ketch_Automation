package KetchAppTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SerachTest extends BaseTest {

	//@Test
	public void AppiumFirst() throws InterruptedException {

		// supported locators: xpath,id,className,accessbilityid,androiduiautomator
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
				.click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//click on global serach
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
		//driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search\"]")).sendKeys("tshirts");
	}

}
