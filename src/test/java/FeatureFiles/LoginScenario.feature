Feature: Validate Login functionality of GrotechMinds Banking Application

  Background: Given User open the URL of Banking application

  @test2
  Scenario Outline: Validate Login functionality of GroTechMind Banking Application
    And clicks on Log in button in Webpage
    And user enters username as "<username>"
    And user enters password as "<password>"
    When user click  on Login button
    Then user will get a success message from the website

    Examples: 
      | username | password |
      | etest    | Test@123 |
