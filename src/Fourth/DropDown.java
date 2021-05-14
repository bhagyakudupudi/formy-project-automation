package Fourth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/dropdown");

		WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
		dropDown.click();

		List<WebElement> links = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
		System.out.println("Number of links: " +links.size());
		for(WebElement l:links)
		{
			String s = l.getText();
			System.out.println(s);

			
			  if(s.equalsIgnoreCase("Drag and Drop")) { l.click(); }
			 
		}


		driver.quit();
	}

}
