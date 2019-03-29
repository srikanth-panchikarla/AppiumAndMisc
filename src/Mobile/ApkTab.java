package Mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ApkTab {

	AndroidDriver<WebElement> driver;
	
	@Test
	public void TabTest() throws MalformedURLException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5");
		capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\srikanthp\\eclipse-workspace\\Appium2\\Apkfile\\ApiDemos-debug.apk");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='1. Content By Id']").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement tb2= driver.findElementByXPath("//android.widget.TextView[@text='TAB2']"); 
		TouchAction action= new TouchAction(driver);
		//action.tap((TapOptions) tb2).perform();
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(tb2))).perform();
		
		
	}
	
}
