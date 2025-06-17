package Activities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestActivities9 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		
		// Open the browser or page
		driver.get("  https://training-support.net/webelements/keyboard-events");
		driver.manage().window().maximize();
		
				// print the page title
				System.out.println(driver.getTitle());
				
			//On the page, type out a string from the Selenium script to show on the page
				builder.sendKeys("This is some random text with abc ").build().perform();
			//Print the message to the console.
				System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
				
		 //Close the browser
				driver.quit();

}
}