package userTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import usermanual.Download;
import usermanual.Initi;


public class Download1 {
	Initi init=new Initi();
	@Test
	public void DownloadTest()
	{
		WebDriver driver=init.DriverInit();
		Download d=new Download(driver);
		d.getDownload();
		
	}
}


