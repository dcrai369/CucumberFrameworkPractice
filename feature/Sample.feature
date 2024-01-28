Feature: Verify  Login functionality

  @tag1
  Scenario: Title of your scenario
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
  Scenario: Title of your scenario
    Given User launch the application
     When User enter username and password as Maps
    |usernameCol|passwordCol|
    |deepak |admin123|
    |deepak2 |admin123|
    
    And User click on login button
    Then User verify Page title