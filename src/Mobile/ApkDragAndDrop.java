package Mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class ApkDragAndDrop {

	public static AndroidDriver<WebElement> driver;  
	
	
	@Test
	public void apkApp() throws MalformedURLException
	{
		  
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5X");
		capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\srikanthp\\eclipse-workspace\\Appium2\\Apkfile\\ApiDemos-debug.apk" );
				
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    System.out.println("5 seconds waited");
	    driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	    
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    
	    WebElement dragDot1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
	    WebElement dropDot2= driver.findElementById("io.appium.android.apis:id/drag_dot_2");
	  
	    TouchAction action= new TouchAction(driver);
	    action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(dragDot1)))
	    .moveTo(ElementOption.element(dropDot2))
	    .release()
	    .perform();
	    
	    	    
	}


	
}
