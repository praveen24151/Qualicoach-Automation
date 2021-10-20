package userTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import usermanual.CreateCourse;
import usermanual.Initi;


public class Course {
	
	Initi init=new Initi();
	
	@Test
	public void VerifyUserTest() throws IOException {
		WebDriver driver=init.DriverInit();
		CreateCourse c=new CreateCourse(driver);
		c.getCreateCours();
	}

}


