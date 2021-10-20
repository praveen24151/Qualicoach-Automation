package userTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import usermanual.EditUser;
import usermanual.Initi;


public class EditUser1 {

	Initi init=new Initi();
	
	@Test
	public void EditUserTest() {
		
		WebDriver driver=init.DriverInit();
		EditUser E=new EditUser(driver);
		E.getEditUser();
		driver.close();
	}
}
