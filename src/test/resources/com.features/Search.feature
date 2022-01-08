Feature:Amazon search

  @smoke
 Scenario: Search a product
   Given I have a search field on amazon page
    |col1|col2|col3|
    | field | data | search|
    | df    |df    |fg     |
   When I search for a product with name "Apple Macbook Pro" and price 1000
   Then Product with name "Apple Macbook Pro" should be displayed


