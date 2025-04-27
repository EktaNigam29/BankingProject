Feature: Validate Contact Us functionality of Banking Domain

  Background: Given User open the URL of Banking application

  @test5
  Scenario: Validate Contact Us functionality of GroTechMind Banking Domain
    And user enter the below details
      | contact_name | contact_email  | contact_phone | contact_address | contact_country | contact_zip |
      | John         | john@gmail.com |    9822222221 | park street     | Delhi           |      197856 |
    Then user will get a success message in ContactUs page
