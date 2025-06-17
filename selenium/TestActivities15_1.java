package Activities;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivities15_1 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/tables");
		driver.manage().window().maximize();
		
				// print the page title
				System.out.println(driver.getTitle());
				
				//Find the number of rows and coloumns in the table and print them
				List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
				System.out.println("Number of rows: " + rows.size());
				List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
				System.out.println("Number of coloumns: " + cols.size());
				
				//find and click the add row button
				 driver.findElement(By.xpath("//button[contains(text(),'Add Row')]")).click();
				//find the newly added row and add the following data:
				//Id: 10
				//Book name: hover car racer
				//author: Matthew reilly
				//Asin: 0330440160
				//price: $7.99
				 String[] dataToAdd = {"10", "Hover Car Racer", "Matthew Reilly", "0330440160", "$7.99"};
				 for (int i=0; i < dataToAdd.length; i++) {
					 By lastRowCells = By.xpath("//table/tbody/tr[last()]/td[" +(i + 1) + "]");
					 driver.findElement(lastRowCells).clear();
					 driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
				 }
			//Print the data from the newly added row
			System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
			
			//close the browser
			driver.quit();
	
	}
}
