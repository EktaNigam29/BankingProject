package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class SignUpPage extends BaseClass{
WebDriver driver;
public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[normalize-space()='Sign Up']")
WebElement signupbtn;

@FindBy(xpath="//input[@name='First Name']")
WebElement FirstName;

@FindBy(xpath="//input[@name='Last Name']")
WebElement LastName;

@FindBy(xpath="//input[@name='Phone']")
WebElement PhoneNo;
@FindBy(xpath="//input[contains(@class, 't-input t-datepicker')]")
WebElement dateOfBirth;
@FindBy(xpath="//select[@id='input_1742711863977']")
WebElement selectGender;
@FindBy(xpath="//input[@id='input_1742711965354']")
WebElement City;
@FindBy(xpath="//input[@id='input_1742711986078']")
WebElement user_name;
@FindBy(xpath="//input[@id='input_1742712432708']")
WebElement Password;
@FindBy(xpath="//button[@type='submit']")
WebElement submitButton;

@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
WebElement textMessage;



public void clicksSignUpBtn()
{
	signupbtn.click();
}

public void enterFirstName(String firstname)
{
	FirstName.sendKeys(firstname);
}

public void enterLastName(String lastname)
{
	LastName.sendKeys(lastname);
}

public void enterPhone(String phonenumber)
{
	PhoneNo.sendKeys(phonenumber);
}

public void enterDOB(String DOB)
{
	dateOfBirth.sendKeys(DOB);
}
public void selectGender(int x)
{
	Select oselect=new Select(selectGender);
	oselect.selectByIndex(x);
}
public void entercity(String city)
{
	City.sendKeys(city);
}
public void enterusername(String uid )
{
	user_name.sendKeys(uid );
}
public void enterpassword(String password )
{
	Password.sendKeys(password );
}
public void clickonSubmit()
{
	submitButton.click();
}

/*public String validateMessage()
{
	String message=textMessage.getText();
	return message;
}*/



	
}
