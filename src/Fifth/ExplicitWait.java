package Fifth;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

				// Create new instance of ChromeDriver
				WebDriver driver = new ChromeDriver();

				// And now use this to visit webpage
				driver.get("https://formy-project.herokuapp.com/autocomplete");

				WebElement autocomplete = driver.findElement(By.id("autocomplete"));
				autocomplete.sendKeys("1555");
				
				WebDriverWait wait = new WebDriverWait(driver,20);
				
				List<WebElement> autocompleteResult =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='pac-item']/child::span[3]")));
				for(WebElement e:autocompleteResult) {
					System.out.println(e.getText());
				}
				autocompleteResult.get(2).click();
				//Close the browser
				//driver.quit();

	}

}
