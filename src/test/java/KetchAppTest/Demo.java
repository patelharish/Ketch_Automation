package KetchAppTest;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class Demo {
	
	@Test
	public void AppiumFirst() throws MalformedURLException {
		// run appium server here optional
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//admin//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//AndroidDriver;
		UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("motorola edge 50 pro");
        options.setAppPackage("com.ketchapp");
        //com.ketchapp.MainActivity - Ketch
        options.setAppActivity(".MainActivity");
        //options.setAppActivity("com.android.vending.AssetBrowserActivity");
        
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        //driver.quit();
        
        service.stop();
		
	}

}
