 Feature: Validate ForgotPassword functionality of GrotechMinds Banking Application
   Background:  Given user open the url for banking application
 
 @test4
  Scenario Outline: Validate ForgotPassword functionality in  GrotechMinds Banking Application
   
    And user clicks on ForgotPassword button
    And user enters the emaild as "<emailid>"
    And user enters the phone_number as "<phonenumber>"
    When user clicks on  Reset Password button
    Then validate that user is getting proper response from the site
    And also verify that the Title of the page is shows correct value

    Examples: 
      | emailid        | phonenumber |
      | ekta@gmail.com |   9088786541 |