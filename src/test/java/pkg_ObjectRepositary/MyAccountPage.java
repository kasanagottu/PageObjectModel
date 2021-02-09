package pkg_ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By Accountlink=By.linkText("Account");

	
	public WebElement AccoutLink()
	{
		return driver.findElement(Accountlink);
	}

}
