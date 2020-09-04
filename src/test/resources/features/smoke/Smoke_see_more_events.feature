Feature: More event on the main page

  Scenario: I as a customer WTBAT see more events than presented on the main page
    Given I access career page of HysSite
    And I Scroll down to Event button
    When I click on ‘Event’ button
    Then page "https://www.hys-enterprise.com/events/" isopened