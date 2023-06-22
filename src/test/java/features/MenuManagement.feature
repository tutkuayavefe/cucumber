import io.cucumber.java.Scenario
import io.cucumber.java.en.Given
import io.cucumber.java.en.When

Feature: Menu Management

  Scenario: Add a menu item

    Given I have a menu item with me "Sandwich" and price 20
    When I add that menu item
    Then Menu Item with me "Sandwich" should be added