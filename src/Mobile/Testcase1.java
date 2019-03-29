package Mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase1{
	WebDriver driver;
	@Test
	
	public void GetChrome() {
		System.out.println("You are in GetChromeMethod");
		//System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriver\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/sessions-parallel-run-and-dependency-in-selenium.html");
	}
	

}
