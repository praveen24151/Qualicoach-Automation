package usermanual;


import org.openqa.selenium.By;


public class admin extends Initi {

	By userbutton=By.className("userbutton");
	By dashboard=By.id("actionmenuaction-1");
	By administration=By.className("administration");
	
	public void getDashboard() throws NullPointerException {
	
		driver.findElement(userbutton).click();
		driver.findElement(dashboard).click();
	}
	
	public void getAdminstration() throws NullPointerException{
		driver.findElement(administration).click();
		
	}
	
	
}
