Feature: Send CV

  Scenario: I as a job seeker WTBAT apply for  job
    Given I go "https://www.hys-enterprise.com/career/"
    When I click on ‘Join Us’ button
    Then career page "https://www.hys-enterprise.com/career/vacancies/" is opened
    And I click on any available vacancy in the list
    And I fill CV form with valid data
    And I click on Drag&Drop button an attach CV file
    And I mark necessary check-box.
    Then I click on Send button
