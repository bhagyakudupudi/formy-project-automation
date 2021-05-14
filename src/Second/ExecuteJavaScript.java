package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {

	public static void main(String[] args) {

		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/modal");

		WebElement modal = driver.findElement(By.id("modal-button"));
		modal.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('close-button').click()");
		
		//WebElement closeButton = driver.findElement(By.id("close-button"));
		
		//js.executeScript("arguments[0].click()",closeButton);
		
		System.out.println("Done");
		
        driver.quit();
	}

}
