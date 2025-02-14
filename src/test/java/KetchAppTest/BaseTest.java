package KetchAppTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static Logger log;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
		// run appium server here optional
		/*service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//admin//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();*/

		// AndroidDriver;
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("motorola edge 50 pro");
		options.setAppPackage("com.totalfoods");
		// com.ketchapp.MainActivity - Ketch
		options.setAppActivity(".MainActivity");
		// options.setAppActivity("com.android.vending.AssetBrowserActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

	@AfterTest
	public void tearDown() {
        //driver.quit();
       //service.stop();
	}
}
