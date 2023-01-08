Feature: CRMpro registration  functionality

  Scenario Outline: Varify CRMpro registration functionality
    Given user launch the browser
    When user hit the given url "https://classic.freecrm.com/register/"
    Then varify user is on CRMpro registration page
    When user select CRMpro edition from the dropdown
    And fill all available field such as "<username>","<lastname>","<email_Id>","<confirm_EmailID>","<username1>","< password1>","<cpassword>"
    And checked on the term and condition checkbox
    And click on the submit button
    Then varify user account create successful massage

    Examples: 
      | username | lastname | email_Id                  | confirm_EmailID           | username1   | password1  | cpassword |
      | kunal   | rathod   | kunalvrathod.11@gmail.com | kunalvrathod.11@gmail.com | kunalrathod | Kunal@123 | Kunal@123 |
