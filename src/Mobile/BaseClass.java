package Mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	String browser;
	WebDriver driver;
	
	
	public WebDriver Setup() throws MalformedURLException, InterruptedException
	
	{
		
		    DesiredCapabilities capabilities  = new DesiredCapabilities();
		    System.out.println("DesiredCapabilities");
       		//capabilities .setCapability(MobileCapabilityType.DEVICE_NAME, "device");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"test");
			System.out.println("DEVICE_NAME");
			capabilities.setCapability("platformName", "Android");
			System.out.println("platformName");
			capabilities.setCapability("browserName","Chrome");
			System.out.println("browserName");
			driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		   
			System.out.println("http://127.0.0.1:4723/wd/hub");
		    driver.get("http://demo.guru99.com/V4/");
		    return driver;
				
			
			
			
			
	}
	
}
