Feature:  Check reference page
Scenario: I as a user I  WTBAT have an opportunity to see more references.
Given I access  https://www.hys-enterprise.com/
And I Scroll down to see ‘See more references’ button.
When I click on ‘See more references’ button.
Then  references page is opened (https://www.hys-enterprise.com/references/)

