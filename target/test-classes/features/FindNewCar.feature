@FindNewCar
Feature: Searching a new cars
  In order to search new car
  As a user
  I have to navigate to carwale.com

 Scenario Outline: Finding a new car
    Given user navigates to a carwale.com website
    When user mouseover to a newcars
    Then user clicks on a find new cars
    And user clicks on a "<carBrand>" car
    And user validates car titel as "<carTitel>"

   Examples:
   |carBrand|carTitel|
   |Toyota  |Toyota Cars|
   |Kia     |Kia Cars   |
   |Honda   |Hyundai Cars|
   |BMW     |BMW Cars   |