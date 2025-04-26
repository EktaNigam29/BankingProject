package StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageClasses.Accountdetails;
import PageClasses.ContactUs;
import PageClasses.Forgotpassword;
import PageClasses.LoginPage;
import PageClasses.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	
	WebDriver driver;
	SignUpPage signup;
	Forgotpassword forgortPassword;
	LoginPage login;
	ContactUs contactUs;
	Accountdetails accountDetails;
	String ActualMessage="Thank you! Your data has been submitted.";
	String Actual_Message="Thank you! Your data has been submitted.";

	//------------------------------Initilization ---------------------//
		@Before  //before hook
		public void initilizeSetup() {
		driver = BaseClass.initializeDriver();
		signup = new SignUpPage(driver);
		login = new LoginPage(driver);
		forgortPassword = new Forgotpassword(driver);
		contactUs = new ContactUs(driver);
		accountDetails = new Accountdetails(driver);
		}
		
		@After("@test1")
		public void closeWindow()
		{
			closeBrowser();
		}
				
	@Given("user open the url for banking application")
	public void user_open_the_url_for_banking_application() {
	System.out.println("Application lunched");
		
		System.out.println(getPageTitle());
		String x=getPageTitle();
		Assert.assertEquals(x, "Home");
		
	}
	@Given("user clicks on SignUp button")
	public void user_clicks_on_sign_up_button() {
		signup.clicksSignUpBtn();
	}


	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String  firstname) {
		  addExplicitWait(By.xpath("//input[@name='First Name']"));
		signup.enterFirstName(firstname);
	}

	@Given("user enters the lastname as {string}")
	public void user_enters_the_lastname_as(String lastname ) {
		  addExplicitWait(By.xpath("//input[@name='Last Name']"));
		signup.enterLastName(lastname);
	}

	@Given("user enters the phonenumber as {string}")
	public void user_enters_the_phonenumber_as(String phonenumber) {
		   addExplicitWait(By.xpath("//input[@name='Phone']"));
		signup.enterPhone(phonenumber);
		//scrollDown();
		
		
	}

	@Given("user enters the dateofbirth as {string}")
	public void user_enters_the_dateofbirth_as(String DOB) {
		  addExplicitWait(By.xpath("//input[contains(@class, 't-input t-datepicker')]"));
		  scrollDown();
		  signup.enterDOB(DOB);
			}

	@Given("user selects the gender")
	public void user_selects_the_gender() {
		signup.selectGender(2);
	}

	@Given("user enters the cityname as {string}")
	public void user_enters_the_cityname_as(String city ) {
	    signup.entercity(city );
	}

	@Given("user enters the userid as {string}")
	public void user_enters_the_userid_as(String uid) {
	    signup.enterusername(uid);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	   signup.enterpassword(password);
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
		signup.clickonSubmit();
	}

	@Then("validate that user is getting proper response from site")
	public void validate_that_user_is_getting_proper_response_from_site() {
	addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		String msg1=	addValidateMessage(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		Assert.assertEquals(msg1 ,ActualMessage);
	}

	@Then("also verify that the Title of the page is showing correct value")
	public void also_verify_that_the_title_of_the_page_is_showing_correct_value() {
		
		System.out.println(getPageTitle());
		String y=getPageTitle();
		Assert.assertEquals(y, "Registration");
	}
	//----------------------------------Login Page -------------------------------------------------

	@Given("clicks on Log in button in Webpage")
	public void clicks_on_log_in_button_in_webpage() {
		addExplicitWait(By.xpath("//a[text()='Log In']"));
		login.clickLogin();
	}

	@Given("user enters username as {string}")
	public void user_enters_username_as(String username) {
		addExplicitWait(By.xpath("//input[@id='input_1495646567135']"));
		login.enterun(username);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		addExplicitWait(By.xpath("//input[@id='input_1742715919526']"));
		login.enterpwd(password);
	}

	@When("user click  on Login button")
	public void user_click_on_login_button() {
		addExplicitWait(By.xpath("//button[@type='submit']"));
		login.submitLogin();
	}

	@Then("user will get a success message from the website")
	public void user_will_get_a_success_message_from_the_website() {
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		String msg=	addValidateMessage(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		Assert.assertEquals(msg ,ActualMessage);
	}


	//-----------------------End of Login Functionality ----------------------//
	
	// ------------------------Forget Password -------------------------------//

	@Given("user clicks on ForgotPassword button")
	public void user_clicks_on_forgot_password_button() {
		 addExplicitWait(By.xpath("//a[text()='Forget Password']"));
		forgortPassword.clickFP();
	}

	@Given("user enters the emaild as {string}")
	public void user_enters_the_emaild_as(String emailid) {
		 addExplicitWait(By.xpath("//input[@id='input_7539084004150']"));
		forgortPassword.enterEmailID(emailid);
	}

	@Given("user enters the phone_number as {string}")
	public void user_enters_the_phone_number_as(String phonenumber) {
		addExplicitWait(By.xpath("//input[@id='input_7539084004151']"));
		forgortPassword.enterphoneno(phonenumber);
		
	}

	@When("user clicks on  Reset Password button")
	public void user_clicks_on_reset_password_button() {
	addExplicitWait(By.xpath("//button[@class='t-submit']"));
		forgortPassword.clickRP();
	
	}

	@Then("validate that user is getting proper response from the site")
	public void validate_that_user_is_getting_proper_response_from_the_site() {
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
	String msg=	addValidateMessage(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
	Assert.assertEquals(msg ,ActualMessage);
		
	}

	@Then("also verify that the Title of the page is shows correct value")
	public void also_verify_that_the_title_of_the_page_is_shows_correct_value() {
		System.out.println(getPageTitle());
				String z=getPageTitle();
			Assert.assertEquals(z, "Forget Password");
	}
	//----------------------------End of Forget Password Functionality-------------------//
	
	//----------------------------Contact Us Functionality --------------------------------//

	@Given("user clicks on ContactUs button in WebPage")
	public void user_clicks_on_contact_us_button_in_web_page() {
		contactUs.clickOnContactUs();
	}
		
	

	@Given("user enters name as {string}")
	public void user_enters_name_as(String contact_name) {
		contactUs.enterContactName(contact_name);
	}

	@Given("user enters email as {string}")
	public void user_enters_email_as(String contact_email) {
		contactUs.enterEmailAddress(contact_email);
	}

	@Given("user enters phone as {string}")
	public void user_enters_phone_as(String contact_phone) {
		 scrollDown();
		contactUs.enterPhoneNumber(contact_phone);
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String contact_address) {
		contactUs.enterContactAddress(contact_address);
	}

	@Given("user enters country as {string}")
	public void user_enters_country_as(String contact_country) {
		contactUs.enterContactCountry(contact_country);
	}

	@Given("user enters zip as {string}")
	public void user_enters_zip_as(String contact_zip) {
		contactUs.enterContactZip(contact_zip);
	}

	@When("user clicks on Submit button in ContactUs page")
	public void user_clicks_on_submit_button_in_contact_us_page() {
		contactUs.clickOnSumbitButton();
	}

	@Then("user will get a success message in ContactUs page")
	public void user_will_get_a_success_message_in_contact_us_page() {
		addExplicitWait(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
String contactusmsg=addValidateMessage(By.xpath("//div[@class='js-successbox t-form__successbox t-text t-text_md']"));
		
		Assert.assertEquals(contactusmsg,ActualMessage);
		System.out.println(contactusmsg);
	}
	//----------------------------End of ContactUs Functionality-------------------//
	
	//------------------------------Account Details Functionality --------------------//
	@Given("clicks on AccountDetails button in Webpage")
	public void clicks_on_account_details_button_in_webpage() throws InterruptedException {
	accountDetails.click_on_Login();
		switchToChildWindow(driver);
		
		addHardcodedWait();
		System.out.println(driver.getCurrentUrl());
	}

	@Given("select and customer from the dropdown")
	public void select_and_customer_from_the_dropdown() throws AWTException {
		
		accountDetails.entername();
	}

	@Given("user clicks  on Login button")
	public void user_clicks_on_login_button() {
		accountDetails.submit_Login();
	}
	@Given("user clicks on Deposit button")
	public void user_clicks_on_deposit_button() {
		addExplicitWait(By.xpath("(//span[@class='TabsList2027980309__label'])[2]"));
		accountDetails.clickdepositButton();
	}

	@Given("user enters the amount as {string}")
	public void user_enters_the_amount_as(String deposit_amount) {
		accountDetails.enterAmount(deposit_amount);
	}

	@Given("user submit the deposit button")
	public void user_submit_the_deposit_button() {
		accountDetails.submit_deposit();
	}

	@Then("balance is updated")
	public void balance_is_updated() {
		String txtbl=addValidateMessage(By.xpath("//div[@id='comp-m8szvc14']"));
		
		Assert.assertEquals(txtbl ,"Balance :");
		System.out.println(txtbl);
	}

	@Then("click on withdrawl tab")
	public void click_on_withdrawl_tab() {
		accountDetails.clickonwithdraw();
	}

	@Then("enter amount to be withdrawn as {string}")
	public void enter_amount_to_be_withdrawn_as(String withdrawal_amount) {
		accountDetails.enterwithdrawAmount(withdrawal_amount);
	}

	@When("click on withdraw button")
	public void click_on_withdraw_button() {
		accountDetails.clickOnWithdrawButton();
	}

	@Then("balance will be updated")
	public void balance_will_be_updated() {
		
String txtb2=addValidateMessage(By.xpath("//div[@id='comp-m8szvumq']"));
		
		Assert.assertEquals(txtb2 ,"₹500");
		System.out.println(txtb2);
	  
	}



}
