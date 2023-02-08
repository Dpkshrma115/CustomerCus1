$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customer.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Test start message",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Customer Menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Customer_Menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view conformation message \"Customers / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_conformation_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Test start message",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view the Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_the_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Customer Menu item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_Customer_Menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search the user by username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User type first name",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_type_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type last name",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_type_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to find customer by name",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_be_able_to_find_customer_by_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@"
    },
    {
      "name": "@epic10"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "Page title should be \"Dashboard/ nopCommerce administraiton\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on the logout link",
  "keyword": "When "
});
formatter.step({
  "name": "Page title should be \"Your store.Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@"
    },
    {
      "name": "@epic10"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Dashboard/ nopCommerce administraiton\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the logout link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_the_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store.Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@"
    },
    {
      "name": "@epic10"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Dashboard/ nopCommerce administraiton\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the logout link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_the_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page title should be \"Your store.Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});