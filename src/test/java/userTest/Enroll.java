package userTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import usermanual.Initi;
import usermanual.UserEnroll;

public class Enroll  {

	
	
	
	@Test
	public void AddUserTest() throws IOException
	{
		Initi init=new Initi();
		WebDriver driver=init.DriverInit();
		UserEnroll e=new UserEnroll(driver);
		e.getUserEnroll();
		driver.close();
	}
}


