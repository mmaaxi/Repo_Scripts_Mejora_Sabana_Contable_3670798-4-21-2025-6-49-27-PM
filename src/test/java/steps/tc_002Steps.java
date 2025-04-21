package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("I open the spreadsheet application")
    public void openSpreadsheetApplication() {
        page.openSpreadsheet();
    }

    @When("I identify the formula in column C")
    public void identifyFormulaInColumnC() {
        Assert.assertTrue(page.isFormulaCorrect());
    }

    @Then("the formula should be {string}")
    public void formulaShouldBeCorrect(String expectedFormula) {
        Assert.assertEquals(expectedFormula, page.getFormulaInColumnC());
    }

    @When("I enter test data in columns D, H, U, O, and E")
    public void enterTestData() {
        page.enterTestData();
    }
    
    @Then("the test data should be displayed correctly")
    public void testDataDisplayedCorrectly() {
        Assert.assertTrue(page.isTestDataDisplayedCorrectly());
    }

    @When("I verify the concatenated result in column C")
    public void verifyConcatenatedResultInColumnC() {
        Assert.assertTrue(page.isConcatenationCorrect());
    }

    @Then("the result in column C should be as expected")
    public void resultShouldBeAsExpected() {
        Assert.assertTrue(page.isConcatenationCorrect());
    }
}