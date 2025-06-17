package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivities6 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		
				// print the page title
				System.out.println(driver.getTitle());
				
				//Find the checkbox input element
				 WebElement checkBox = driver.findElement(By.id("checkbox"));
				 
				 //check if it is selected on the page
				 System.out.println(checkBox.isSelected());//False
				 
				 //Click the checkbox
				checkBox.click();
				
				//Check if it is selected again and print the result.
						 System.out.println(checkBox.isSelected()); //True
						 //close the browser
						 driver.quit();
	}

}
