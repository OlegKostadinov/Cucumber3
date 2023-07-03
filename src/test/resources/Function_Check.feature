Feature: Function click
  Scenario: Link.Download_Check
    Given the user is on the website
    When user clicks the download button
    Then user have the downloads page

  Scenario: PypiSteps
    Given the user is on the webpage
    When user clicks the PyPi button
    When user enters try in the search
    When user clicks the confirmation button

    Then user can see the result