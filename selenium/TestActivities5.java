package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestActivities5 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		
				// print the page title
				System.out.println(driver.getTitle());
				
				//Find the checkbox input element
				 WebElement checkBox = driver.findElement(By.id("checkbox"));
				 System.out.println(checkBox.isDisplayed());
				 //Click the "Remove Checkbox" button
				 driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
				//Check if it is visible again and print the result.
						 System.out.println(checkBox.isDisplayed()); //False
						 //close the browser
						 driver.quit();

	}
}