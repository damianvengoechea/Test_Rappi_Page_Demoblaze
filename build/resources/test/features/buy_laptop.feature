
Feature: Buy technology products
  I as a user
  I want to search for a laptop
  To buy it

  Scenario Outline: Buy a laptop sucessfully
    Given that Damian selects the following <Device>
    When he add to the cart
    And start pay place order with next data
      | Name   | Country   | City   | Credit_card   | Month   | Year   |
      | <Name> | <Country> | <City> | <Credit_card> | <Month> | <Year> |
    Then he should see the message Thank you for your purchase! as confirmation message
    Examples:
      | Device      | Name              | Country  | City     | Credit_card | Month | Year |
      | Dell i7 8gb | Damian Vengoechea | Colombia | Medellin | 1234567     | 11    | 2020 |
