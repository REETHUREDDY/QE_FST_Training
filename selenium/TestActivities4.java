package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivities4 {
	public static void main(String[] args) {
		// Initializer driver
		WebDriver driver = new FirefoxDriver();
		
		// Open the browser or page
		driver.get("https://training-support.net/webelements/target-practice");
		        // page interactions
				// print the page title
				System.out.println(driver.getTitle());
				
				String message = driver.findElement(By.xpath("//h3 [contains(@class, ' text-orange-600')]")).getText();
				System.out.println(message);
				System.out.println(message.equals("Heading #3"));
				
				//Find the 5th header on the page and print it's color.
				String message1 = driver.findElement(By.xpath("//h5 [contains(@class, 'text-purple-600')]")).getCssValue("color");
				//(By.xpath("//h3[text()= "Heading #3']")) we can use this line instead of the above contains,class,purple words.
				//Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		        //System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
		        //System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

				System.out.println(message1);
				
				//Find the purple button and print all it's classes
				String classes = driver.findElement(By.className("bg-purple-200")).getAttribute("class");
				System.out.println(classes);
				
				//Find the slate button and print it's text
				String slate = driver.findElement(By.className("bg-slate-200")).getText();
				System.out.println(slate);
				
				//close the browser
				driver.quit();
				
}

}