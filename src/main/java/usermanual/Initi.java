package usermanual;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.*;
public class Initi {
	public WebDriver driver;
	
	public WebDriver DriverInit() {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://test.qualicoach.org");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void DriverClose() {
		driver.close();
	}

}