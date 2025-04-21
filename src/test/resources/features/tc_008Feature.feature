Feature: Validate formula update in 'Monto Acumulado Folio OPC (2121)'

  Scenario: Validate the updated formula and calculate result
    Given I am on the Excel sheet for 'Monto Acumulado Folio OPC (2121)'
    When I verify the presence of the updated formula
    Then I ensure the formula is correctly implemented
    When I enter values into the fields involved in the sum
    Then All values are displayed correctly in the Excel
    When I calculate the expected sum result and compare it with the displayed result
    Then The resultant value is correct and consistent