package Activities;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivities14 {
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
				
				//Find the number of rows and columns in the table and print them.
				List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
				System.out.println("Number of rows: " + rows.size());
				List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
				System.out.println("Number of coloumns: " + cols.size());
				
				//Find and print the Book Name in the 5th row.
				System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
				
				//Click the header of the Price column to sort it in ascending order.
				WebElement price = driver.findElement(By.xpath("//th[text()='Price']"));
				builder.click(price).pause(5000).build().perform();
				
				
				//Find and print the Book Name in the 5th row again.
				System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
				
                //close the browser
				driver.quit();
				
}
}

