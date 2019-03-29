package Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class apkAppLaunch {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		 File appDir = new File(classpathRoot, "/Apkfile/");
		 File app = new File(appDir, "FreeSamples_v1.0.0_apkpure.com.apk");
		
		// To create an object of Desired Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Name of mobile web browser to automate. It should be an empty string, as we are automation an app
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

		// Name of the OS: Android, iOS or FirefoxOS
		capabilities.setCapability("platformName", "Android");

		// Mobile OS version –  My device is running Android 4.4.2
		capabilities.setCapability(CapabilityType.VERSION, "4.4.2");

		// Device name:  – I am using Micromax A311
		capabilities.setCapability("deviceName", "Nexus_5X_API_28");

		// An absolute local path to the APK file
		capabilities.setCapability("app", app.getAbsolutePath());

		// Java package of the tested Android app
		//capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");

		// An activity name for the Android activity you want to run from your package.
		//capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("appActivity", "com.freesamplesus.myapp");
		// Constructor to initialize driver object with new Url and Capabilities
		 driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		 //driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		 
	}

}
