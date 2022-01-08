@All
Feature: Uber Booking feature

  Background:
    Given I am logged into app

  Scenario: Booking cab sedan
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

    @smoke
  Scenario: Booking cab suv
    Given User wants to select a car type "suv" from uber app
    When User selects car "suv" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

      @regression
  Scenario: Booking cab mini
    Given User wants to select a car type "mini" from uber app
    When User selects car "mini" and pick up point "Mumbai" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD