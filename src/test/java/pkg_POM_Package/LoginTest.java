package pkg_POM_Package;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pkg_ObjectRepositary.LoginPage;
import pkg_ObjectRepositary.MyAccountPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void Login()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.EmailAdd().sendKeys("qa.k.venkatesh@gmail.com");
		loginPage.Password().sendKeys("Pranika@1");
		loginPage.LoginBtn().click();
		
		MyAccountPage Acc=new MyAccountPage(driver);
		Assert.assertTrue(Acc.AccoutLink().isDisplayed());
		System.out.println("Login is Successful");
		
		}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
