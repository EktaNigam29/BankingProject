Feature: Validate Signup functionality of GrotechMinds Banking Application

  @test1
  Scenario Outline: Validate Signup functionality in  GrotechMinds Banking Application
    Given user open the url for banking application
    And user clicks on SignUp button
    And user enters the firstname as "<firstname>"
    And user enters the lastname as "<lastname>"
    And user enters the phonenumber as "<phonenumber>"
    And user enters the dateofbirth as "<DOB>"
    And user selects the gender
    And user enters the cityname as "<city>"
    And user enters the userid as "<uid>"
    And user enters the password as "<password>"
    When user clicks on Submit button
    Then validate that user is getting proper response from site
    And also verify that the Title of the page is showing correct value

    Examples: 
      | firstname | lastname | phonenumber | DOB        | city    | uid    | password |
      | Harry     | dsouza   |   9088786541 | 05-05-1994 | Kolkata | etest | Test@123 |

 