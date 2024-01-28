Feature: Verify  Login functionality

  @tag1
  Scenario: Verify user able to login with vaild credentials
    Given User launch the application
    When User enter username and password
    |deepak |admin123|
    
    When User enter username and password
    |usernameCol|passwordCol|
    |deepak |admin123|
    |deepak2 |admin123|
    
    And User click on login button
    Then User verify Page title
 
 @tag1
  Scenario: Verify user able to login with invaild credentials
    Given User launch the application
     When User enter username and password as Maps
    |usernameCol|passwordCol|
    |deepak |admin123|
    |deepak2 |admin123|
    
    And User click on login button
    Then User verify Page title
    
     @tag1
  Scenario: Verify user not able to login without entering passowrd
    Given User launch the application
     When User enter username and password as Maps
    |usernameCol|passwordCol|
    |deepak |admin123|
    |deepak2 |admin123|
    
    And User click on login button
    Then User verify Page title
    
    @tag2
  Scenario: Title of your scenario for failed
    Given User launch the application and failed test