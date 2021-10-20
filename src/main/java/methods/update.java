package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class update {
	

	public WebDriver driver;
	public update(WebDriver driver)
	{
		this.driver=driver;	

}
	public void upprofile()
	{
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='userbutton']")).click();

		driver.findElement(By.xpath("//*[@data-title='profile,moodle']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Edit profile')]")).click();

		driver.findElement(By.xpath("//*[@id='id_firstname']")).clear();

		driver.findElement(By.xpath("//*[@id='id_firstname']")).sendKeys("Test141");

		driver.findElement(By.xpath("//*[@value='Update profile']")).click();
	
	}
}