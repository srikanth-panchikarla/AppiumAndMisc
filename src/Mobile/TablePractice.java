package Mobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		WebElement table = driver.findElement(By.tagName("table"));
//Getting rows in the tble 
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int count_rows = rows.size();

		// for(int i=0;i<count_rows;i++)// WebElement value:rows)
		for (WebElement rowValue : rows) {

			System.out.println("Rows values: " + rowValue.getText());
		}

		System.out.println("====Rows count: " + count_rows);
//getting columns in the table

		List<WebElement> columns = table.findElements(By.tagName("td"));
		int count_columns = columns.size();
		for(WebElement colValue:columns)
		{
			System.out.println("Columns value:" + colValue.getText());
			
		}
		
		System.out.println("Columns count: " + count_columns);
		driver.quit();

	}

}
