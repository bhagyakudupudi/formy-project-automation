package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement src = driver.findElement(By.id("image"));
		WebElement dest = driver.findElement(By.id("box"));

		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).build().perform();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='box']/p")).getText());
		driver.quit();
	}

}
