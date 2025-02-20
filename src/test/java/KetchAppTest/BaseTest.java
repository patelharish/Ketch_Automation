package KetchAppTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static Logger log;
	public WebDriverWait wait;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		// run appium server here optional
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//admin//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		// AndroidDriver;
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("Pixel 6a");
		options.setAppPackage("com.ketchapp");
		// com.ketchapp.MainActivity - Ketch
		options.setAppActivity(".MainActivity");
		// options.setAppActivity("com.android.vending.AssetBrowserActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@AfterTest
	public void tearDown() {
        //driver.quit();
       //service.stop();
	}
}
