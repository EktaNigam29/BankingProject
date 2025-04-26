Feature: Validate Contact Us functionality of Banking Domain

  Background: Given User open the URL of Banking application
  @test3
  Scenario Outline: Validate Contact Us functionality of GroTechMind Banking Domain
    And user clicks on ContactUs button in WebPage
    And user enters name as "<contact_name>"
    And user enters email as "<contact_email>"
    And user enters phone as "<contact_phone>"
    And user enters address as "<contact_address>"
    And user enters country as "<contact_country>"
    And user enters zip as "<contact_zip>"
    When user clicks on Submit button in ContactUs page
    Then user will get a success message in ContactUs page

    Examples: 
      | contact_name | contact_email  | contact_phone | contact_address | contact_country | contact_zip |
      | John         | john@gmail.com |    9822222221 | park street     | Delhi           |      197856 |
