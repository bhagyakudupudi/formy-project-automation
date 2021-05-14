package Six;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.ConfirmationPage;
import Pages.FormPage;


public class CompleteForm {

	public static void main(String[] args) {
		// Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkudupudi\\Desktop\\Bhagya\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// Create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// And now use this to visit webpage
		driver.get("https://formy-project.herokuapp.com/form");

		FormPage.submitForm(driver);
		ConfirmationPage.waitForAlertBanner(driver);
		Assert.assertEquals("The form was successfully submitted!",ConfirmationPage.getBannerText(driver));		
		
		driver.quit();
	}

	

	

}
