package Qualicoach.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import methods.certificate1;
import methods.eroll;
import methods.feedback;
import methods.quiz;
import methods.update;
import pageobject.stLogin;

public class VerifyLogin extends driverInit {
	public WebDriver driver;

	public void login1() {
		driver.get("https://test.qualicoach.org");
		stLogin l = new stLogin(driver);
		l.uname().sendKeys("scam143");
		l.pass().sendKeys("scam143");
		l.lin().click();
	}

	@Test
	public void aloginTest() throws InterruptedException 
	{
		driver=init();
		
		
		login1();
		
		
		eroll e = new eroll(driver);
		e.enroll();
		
		Thread.sleep(2000);		
		driver.close();
	}
	@Test
	public void bquizetest() throws InterruptedException 
	{
		driver=init();
		
		
		login1();
		
		
		quiz q = new quiz(driver);
		q.studentquiz();
		
		Thread.sleep(2000);		
		driver.close();
	}	

	@Test
	public void cstudentfeed() throws InterruptedException 
	{
	driver=init();
		
	login1();
	
	feedback f = new feedback(driver);
	f.feedbackTest();
		
		
	}
	
		
	@Test
	public void dcertificateTest() throws InterruptedException 
	{
		driver=init();
		
		login1();
		
		certificate1 c=new certificate1(driver);
		c.coursecerti();
	
	}
	
	@Test
	public void eupdateprofile() {
		driver=init();
		
		login1();
		
		update u=new update(driver);
		u.upprofile();
		
	}
}
