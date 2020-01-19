Feature: Contact us form
@P1
  Scenario: Submit contact us form successfully
    Given open web driver university web page
    And  navigate to contact us form
    When i submit contact us form with correct data
    Then i should get success message

#  @P2
#  Scenario: Submit contact us form when all data fields are not provided
#    Given open web driver university web page
#    And  navigate to contact us form
#    When i submit contact us form with empty email
#    Then i should get error message
#
#  @P3
#  Scenario: login portal
#    Given open web driver university web page
#    And navigate to the login portal
#    When fill the email and password
#    Then click on login button successfully
#
#  @P4
#  Scenario: login portal will not login if either password or email is incorrect
#    Given open web driver university web page
#    And navigate to the login portal
#    When either email or password is incorrect
#    Then not login
#
#  @P5
#  Scenario: click the Button Click and show the all necessary part
#    Given open web driver university web page
#    And navigate to Button Click
#
#  @P6
#  Scenario: check in to do list
#    Given open web driver university web page
#    And navigate to the To do list
#    Then add the new list
#    Then delete the old list
#
#  @P7
#  Scenario: open the page object model
#    Given open web driver university web page
#    And navigate to page object model
#    Then show the items
#    Then open the new items
#    Then back to the  contact us page
#    When i submit contact us form with correct data
#    Then i should get success message
#
#    Then fill the  correct data
#    Then click submit
#
#  @P8
#  Scenario:Accordion and Text affect
#    Given open web driver university web page
#    And navigate to the accordion and text affect
#    Then open the manual testing
#    Given open web driver university web page
#    And  navigate to contact us form
#    When i submit contact us form with correct data
#
#  @P9
#  Scenario: DropDown page
#    Given open web driver university web page
#    And navigate to the dropdown
#    When click on the dropdown list
#
#
#
#
#
#
#
#
#
#
#
#
#
#
