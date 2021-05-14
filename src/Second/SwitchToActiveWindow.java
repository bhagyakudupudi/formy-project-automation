package Second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		String parentWindow = driver.getWindowHandle();

		WebElement newTabbutton = driver.findElement(By.id("new-tab-button"));
		newTabbutton.click();
		
		Set<String> multipleWindows = driver.getWindowHandles(); 
		List<String> l = new ArrayList<String>(multipleWindows);
		
		System.out.println("Number of windows opened are: "+ l.size());
		for(String s:l)
		{
			if(!(s.equalsIgnoreCase(parentWindow)))
			{
				driver.switchTo().window(s);
				System.out.println("List:: Child Window url: " + driver.getCurrentUrl());
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent tab url: " + driver.getCurrentUrl());
		driver.quit();

	}

}

/*
 * Iterator<String> itr = multipleWindows.iterator(); while(itr.hasNext()) {
 * String child = itr.next(); if(!(child.equalsIgnoreCase(parentWindow))) {
 * driver.switchTo().window(child); System.out.println("Child tab url: " +
 * driver.getCurrentUrl()); driver.close(); } }
 */
