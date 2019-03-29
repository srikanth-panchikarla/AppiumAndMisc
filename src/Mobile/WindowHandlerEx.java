package Mobile;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerEx {
public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String parentWindow= driver.getWindowHandle();
		System.out.println("ParentWindow handler: " +parentWindow);
		
		Set<String> allwindow =driver.getWindowHandles();
		Iterator<String> it= allwindow.iterator();
		
		while(it.hasNext())
		{
			String childwin=it.next();
			System.out.println("child window" + childwin);
			
			if(parentWindow!=childwin)
			{
				
				driver.switchTo().window(childwin);	
				
			}
			
			
		}
		
		
	/*	int countOfWindows = allwindow.size();
	
		boolean noParentWindow= allwindow.remove(parentWindow);
		
		for(String handle:allwindow)
			
		{
			
				driver.switchTo().window(handle);	
				driver.findElement(By.name("emailid")).sendKeys("Srikanth");
			
				
		}*/
		
		driver.switchTo().window(parentWindow);
		System.out.println("All Window handler: " +allwindow);
	//	System.out.println("Number of all window" + countOfWindows);
		//System.out.println("No parent window" + noParentWindow);
	
		
		
		

		
	}

}
