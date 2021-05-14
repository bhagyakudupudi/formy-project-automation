package Fourth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/datepicker");

		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		
		driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[5]/td[2]")).click();
		
		/*
		 * date.sendKeys("05/15/2022");
		 * 
		 * date.sendKeys(Keys.ENTER);
		 */
		
		  

	}

}
