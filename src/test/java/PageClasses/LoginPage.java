package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends BaseClass{
	WebDriver driver;
	public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		} 
	@FindBy(xpath="//a[text()='Log In']")
	WebElement loginbtn;
	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement userName;
	@FindBy(xpath="//input[@id='input_1742715919526']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginSumbit;
	public void clickLogin()
	{
		loginbtn.click();
	}
	public void enterun(String username)
	{
		userName.sendKeys(username);
	}
	public void enterpwd(String password)
	{
		passWord.sendKeys(password);
	}
	public void submitLogin()
	{
		loginSumbit.submit();
	}
}
