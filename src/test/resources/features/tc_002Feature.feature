Feature: Formula Concatenation Validation

  Scenario: Validate concatenation formula in key column
    Given I open the spreadsheet application
    When I identify the formula in column C
    Then the formula should be "=CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)"
    When I enter test data in columns D, H, U, O, and E
    Then the test data should be displayed correctly
    When I verify the concatenated result in column C
    Then the result in column C should be as expected