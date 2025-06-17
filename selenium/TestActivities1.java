package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivities1 {
	
	
		public static void main(String[] args) {
			// Initializer driver
			WebDriver driver = new FirefoxDriver();
			
			// Open the browser or page
			driver.get("https://training-support.net/");
			
			// page interactions
			// print the page title
			System.out.println(driver.getTitle());
			
			// close the browser
			driver.quit();
			
		}

}
