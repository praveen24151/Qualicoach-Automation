package userTest;

 
	 import org.openqa.selenium.WebDriver;
	 import org.testng.annotations.Test;

import usermanual.DeleteUser;
import usermanual.Initi;


	 public class DeleteUser1 {
		 Initi init=new Initi();
	 	@Test
	 	public void VerifyDeleteTest() {
	 		WebDriver driver=init.DriverInit();
	 		DeleteUser d=new DeleteUser(driver);
	 		d.getDelete();
	 		driver.close();
	 	}
	 }


