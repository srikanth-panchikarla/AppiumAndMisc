package Mobile;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass  {

public static WebDriver driver;


@Test
public  WebDriver main() throws MalformedURLException, InterruptedException {

	BaseClass baseclass= new BaseClass();
		driver  = baseclass.Setup();
	    /*DesiredCapabilities capabilities  = new DesiredCapabilities();
	    System.out.println("DesiredCapabilities");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"test");
		System.out.println("DEVICE_NAME");
		capabilities.setCapability("platformName", "Android");
		System.out.println("platformName");
		capabilities.setCapability("browserName","Chrome");
		System.out.println("browserName");
		WebDriver driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		System.out.println("http://127.0.0.1:4723/wd/hub");
        driver.get("http://demo.guru99.com/V4/");*/
		driver.findElement(By.name("uid")).sendKeys("mngr185172");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("vedamap");
		Thread.sleep(5000);
		WebElement webElement =  driver.findElement(By.xpath("//input[@type='submit'and @name='btnLogin']"));//You can use xpath, ID or name whatever you like
		webElement.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		webElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("clicked Login button");
		String actualTitle= driver.getTitle();
		String expectedTitle = "Guru99 Bank Manager HomePage"; 
			
			if(actualTitle.equalsIgnoreCase(expectedTitle)) 
			{	
				assertTrue(true);
				System.out.println("Title Matched");
			}
			else
			{
				assertTrue(false);
				 System.out.println("Title didn't match");
			}
				
			
			System.out.println("Driver success");
			//driver.quit();
			
			//driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		//	driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
			//System.out.println("clicked logout");
			//WebDriverWait wait =  wait.until(ExpectedConditions.alertIsPresent());
			//Alert alert = driver.switchTo().alert();
			//alert.accept();
			
return driver;
}

}
