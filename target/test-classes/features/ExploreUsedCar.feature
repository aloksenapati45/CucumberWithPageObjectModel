@UsedCar
Feature: Searching for a used TATA car
  As a user
  I have to navigate to carwale.com and search for a used car

  Scenario: Finding a used TATA car
    Given user navigates to a carwale.com website
    When user mouseover to a Used Cars
    Then user clicks on a Explore Used Cars
    And user clicks on a TATA car
    And user validates car titel as Used Tata Cars in India
