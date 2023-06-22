package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    RestaurantMenu LocationMenu;


    @Given("I have a menu item with name {string} and price {int}")
    public void menuItem(String newMenuItemName, Integer price) {
        NewMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price);
        System.out.println("Step 1");

    }

    @When("I add that menu item")
    public void addMenuItem() {
        LocationMenu.addMenuItem(NewMenuItem);
        System.out.println("Step 2");
    }

    @Then("Menu Item with me {string} should be added")
    public void menuItemAddedAssertion() {
        boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
        System.out.println("Step 3" + Exists);

    }
}
