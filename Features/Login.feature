Feature: Login
@
 @epic10 @smoke
  Scenario Outline: Successful login with valid credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "<username>" and Password as "<password>"
    And Click on Login button
    Then Page title should be "Dashboard/ nopCommerce administraiton"
    When User click on the logout link
    Then Page title should be "Your store.Login"
    And Close browser 
  
    Examples:
|username|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin|
    
    @epic10   
    Scenario Outline: Unsuccessful login with invalid credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "<username1>" and Password as "<password1>"
    And Click on Login button
    Then Page title should be "Dashboard/ nopCommerce administraiton"
    When User click on the logout link
    Then Page title should be "Your store.Login"
    And Close browser  



Examples:
|username1|passowrd1|
|nextexample@gmail.com|passwring|
|StrgentPI@gmail.com|String564|
|Sharma95deepak@gmail.com|itswrong|