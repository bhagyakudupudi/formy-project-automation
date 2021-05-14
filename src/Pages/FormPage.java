package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	public static void submitForm(WebDriver driver)
	{
		driver.findElement(By.id("first-name")).sendKeys("bhagya");
		driver.findElement(By.id("last-name")).sendKeys("kudupudi");
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		driver.findElement(By.cssSelector("input#radio-button-3")).click();
		driver.findElement(By.id("checkbox-2")).click();
		WebElement dropDown = driver.findElement(By.id("select-menu"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("5-9");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[5]/td[4]")).click();
		driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();
	}

}
