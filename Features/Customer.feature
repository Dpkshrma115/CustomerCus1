Feature: Customer

Background: Test start message

  Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login button
    Then User can view the Dashboard
    When User click on customer menu
    And User click on Customer Menu item
 
@reg @smoke
  Scenario: Add a new customer
  
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
    And click on save button
    Then User can view conformation message "Customers / nopCommerce administration"
    And Close browser

@sanity
  Scenario: Search Customer by email id

    And Enter customer email id
    When click on search button
    Then User should be able to find email in search table
    And Close browser

@retest @smoke
  Scenario: Search the user by username

    When User type first name
    And User type last name
    When click on search button
    Then User should be able to find customer by name
    And Close browser
