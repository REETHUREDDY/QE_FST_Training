package Activities;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivities15_2 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		
		// Open the browser or page
		driver.get(" https://training-support.net/webelements/sliders");
		driver.manage().window().maximize();
		        // print the page title
				System.out.println(driver.getTitle());
				
				//first print the 50%
			   WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
			   System.out.println(volumeValue.getText());
			   //find the slider
			   WebElement slider = driver.findElement(By.id("volume"));
			   //move it to 25%
			   builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-120, 0).release().pause(3000).build().perform();
			   //print the new value
			   System.out.println(volumeValue.getText());
			   //move it to 75%
			   builder.moveToElement(slider).clickAndHold(slider).moveByOffset(120, 0).release().pause(3000).build().perform();
				//print the new value
			   System.out.println(volumeValue.getText());
	           //close the browser
			   driver.quit();

}
}