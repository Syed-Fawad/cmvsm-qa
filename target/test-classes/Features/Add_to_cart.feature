@smoketest
Feature: Add to cart a product

 @smoketest 
  Scenario: Add a product in cart
    Given I am on the Catalog page
    And Add a product in cart
    When User click on the cart button
    Then Product added in the cart successfully
