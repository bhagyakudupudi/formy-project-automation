package Fourth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/radiobutton");

		List<WebElement> radios = driver.findElements(By.cssSelector("div.form-check input"));
		for(WebElement r:radios)
		{
			System.out.println(r.getAttribute("value"));
		}
		radios.get(2).click();
		
		System.out.println("Third radio button clicked");
		driver.quit();
	}

}
