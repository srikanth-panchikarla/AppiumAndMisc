package Mobile;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		MouseHover mh=new MouseHover();
				mh.toolTip();
		//driver.get("http://demo.guru99.com/test/newtours");
	/*	driver.get("http://demo.guru99.com/test/tooltip.html ");
		//WebElement homeLink= driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		WebElement homeLink= driver.findElement(By.linkText("Home"));
		System.out.println(homeLink);
		WebElement td_Home= driver.findElement(By.cssSelector("tr.mouseOut:nth-child(1) > td:nth-child(1)"));
		
		Actions act= new Actions(driver);
		Action actionhover=act.moveToElement(homeLink).build();
		System.out.println("Action hover move to element");
		String backgroundcolor =	td_Home.getCssValue("background-color");
		actionhover.perform();
	System.out.println(backgroundcolor); */
	}
	
	
	
	public void toolTip()
	
	{
		driver.get("http://demo.guru99.com/test/tooltip.html ");
		WebElement dowload_btn= driver.findElement(By.xpath("//a[@id='download_now']"));
		Actions builder= new Actions(driver);
				builder.moveToElement(dowload_btn).build().perform();
				
		WebElement toolTipElement= driver.findElement(By.xpath("//div[@class='tooltip']"));
		WebElement textOntooltip = driver.findElement(By.xpath("//a[contains(text(),\"What's new in 3.2\")]"));
		String text= textOntooltip.getText();
		
		if (toolTipElement.isDisplayed())
		{
			assertEquals(text, "What's new in 3.2");
			System.out.println("Tool tip displayed with text:" + text);
			driver.quit();
		}
				
		
	}

}
