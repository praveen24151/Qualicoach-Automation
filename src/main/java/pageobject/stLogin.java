package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class stLogin 
{
	public WebDriver driver;
	public stLogin(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement uname()
	{
		return driver.findElement(By.id("username"));
	}
	
	public WebElement pass()
	{
		return driver.findElement(By.id("password"));
	}
	
	public WebElement lin()
	{
		return driver.findElement(By.id("loginbtn"));
	}
	
	

}
