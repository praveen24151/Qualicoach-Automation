package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class certificate1
{
	public WebDriver driver;
	public certificate1(WebDriver driver)
	{
		this.driver=driver;
	}
	public void coursecerti() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		//view and download certificate	 
		driver.get("https://test.qualicoach.org/ ");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("user88");
		driver.findElement(By.id("password")).sendKeys("User@9146");
		driver.findElement(By.id("loginbtn")).click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		Actions a11 = new Actions(driver);
		WebElement move11 = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='ISTQB-ISEB']"));
		a11.moveToElement(move11).click().build().perform();


		WebElement x = (WebElement) driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] "));
		a11.moveToElement(x).click().build().perform();
		WebElement d = (WebElement) driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] / div[2] / div / ul / li / a "));
		a11.moveToElement(d).click().build().perform();
		Thread.sleep(3000);
		WebElement y= (WebElement)driver.findElement(By.xpath("//div[@role='main'] /div / div / form / div / input[@type='submit']"));
		a11.moveToElement(y).click().build().perform();
	}
}