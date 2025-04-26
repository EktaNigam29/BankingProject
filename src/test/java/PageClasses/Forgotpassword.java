package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	WebDriver driver;
	public Forgotpassword(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath="//a[text()='Forget Password']")
	WebElement forgotpassword;

	@FindBy(xpath="//input[@id='input_7539084004150']")
	WebElement emailID;

	@FindBy(xpath="	//input[@id='input_7539084004151']")
	WebElement phoneNumber;
	@FindBy(xpath="//button[@class='t-submit']")
	WebElement resetPassword;
	@FindBy(xpath="//div[contains(@class, 'js-successbox t-form__successbox t-text t-text_md')]")
	WebElement textMessage1;


	
	
	public void clickFP()
	{
		forgotpassword.click();
	}
	public void enterEmailID(String emailid)
	{
		emailID.sendKeys(emailid);
	}
	public void enterphoneno(String phonenumber)
	{
		phoneNumber.sendKeys(phonenumber);
	}
	public void clickRP()
	{
		resetPassword.submit();
	}
	/*public String validateMessage()
	{
		String message=textMessage1.getText();
		return message;
	}*/

}
