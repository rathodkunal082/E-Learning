Feature: Free CRM login feature

  Scenario Outline: Free CRM login test scenario
    Given User is already on login page.
    When title of the login page is Free CRM
    And User click on the login button
    And user enter "<username>" and enter "<password>"
    Then user click on the login button
    Then Varify error massage

    Examples: 
      | username | password  |
      | naveenk  | naveen123 |
      | kunal    | kunal123  |
