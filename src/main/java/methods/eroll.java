package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class eroll 
{
	public WebDriver driver;
	public eroll(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public void enroll() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(
				By.xpath("//div[@cat-id='3'] /a /p[text()='API Automation using REST Assured (Beginners)']"));
		a.moveToElement(move).click().build().perform();
		if ((boolean) driver.findElement(By.xpath("//*[@value='Enrol me']")).isDisplayed())
			driver.findElement(By.xpath("//*[@value='Enrol me']")).click();
	}

}
