package pkg_ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By EmailAddress=By.id("input-email");
	private By Password= By.id("input-password");
	private By LoginBtn= By.xpath("//input[@value='Login']");
	
	public WebElement EmailAdd()
	{
		return driver.findElement(EmailAddress);
	}

	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement LoginBtn()
	{
		return driver.findElement(LoginBtn);
	}

}
