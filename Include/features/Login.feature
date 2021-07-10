Feature: Test login functionality

  @Smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters the <username> and <password>
    And Clicks on login button
    Then user is navigated the home page

		@Valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @Invalid 
     Examples: 
      | username | password |
      | Admin123 | abc456   |