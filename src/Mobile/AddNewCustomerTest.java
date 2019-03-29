package Mobile;

import java.net.MalformedURLException;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddNewCustomerTest {

WebDriver driver;

@Test	
public void addCustomer() throws MalformedURLException, InterruptedException
	{
		
	
		LoginTest login = new LoginTest();
		driver= login.main();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys("srikanthi");
		//driver.findElement(By.name("rad2")).click();
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.id("dob")).sendKeys("28/11/1980");
		System.out.print("dob clicked");
					
	}
	
}
