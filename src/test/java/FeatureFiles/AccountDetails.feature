Feature: Validate AccountDetails functionality of GrotechMinds Banking Application

  Background: Given User open the URL of Banking application

  @test4
  Scenario Outline: Validate AccountDetails functionality of GroTechMind Banking Application
    And clicks on AccountDetails button in Webpage
    And select and customer from the dropdown
    And user clicks  on Login button
    And user clicks on Deposit button
    And user enters the amount as "<deposit_amount>"
    And user submit the deposit button
    Then balance is updated
    And click on withdrawl tab
    And enter amount to be withdrawn as "<withdrawal_amount>"
    When click on withdraw button
    Then balance will be updated

    Examples: 
      | deposit_amount | withdrawal_amount |
      |           1000 |               500 |
