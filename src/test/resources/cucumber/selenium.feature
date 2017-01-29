Feature: WebTest
  As a user
  I want to use a Web page
  So that I know how to automate using Selenium

  Scenario: Open web page
    Given I have a webdriver
    When I open web page http://google.com
    Then page title is Google