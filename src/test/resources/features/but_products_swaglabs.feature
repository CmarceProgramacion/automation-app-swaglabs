#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es
#language: en

@All
Feature: Validate shopping cart
  As a user of Swaglabs
  I want to access the app
  To purchase online

  Background: Access to the main platform
    Given that I access the app of the Swaglabs
      | standard_user | secret_sauce |


  @loginBuyProducts
  Scenario Outline: Validate the product in the shopping cart on the app
    When I add product to cart
      | <productName> | <firstName> | <lastName> | <postalCode> |
    Then Check the purchase confirmation message
      | <message> |

    Examples:
      | message  | productName         | firstName | lastName | postalCode | message                 |
      | SWAGLABS | Sauce Labs Backpack | Pepe      | Sanchez  | 00005      | THANK YOU FOR YOU ORDER |