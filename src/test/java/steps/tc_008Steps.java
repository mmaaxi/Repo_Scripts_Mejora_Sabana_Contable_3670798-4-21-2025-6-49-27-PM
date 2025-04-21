package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("^I am on the Excel sheet for 'Monto Acumulado Folio OPC \\(2121\\)'$")
    public void i_am_on_the_excel_sheet() {
        page.openExcelSheet();
    }

    @When("^I verify the presence of the updated formula$")
    public void i_verify_the_presence_of_the_updated_formula() {
        Assert.assertTrue(page.isFormulaUpdated());
    }

    @Then("^I ensure the formula is correctly implemented$")
    public void i_ensure_the_formula_is_correctly_implemented() {
        Assert.assertTrue(page.isFormulaCorrect());
    }

    @When("^I enter values into the fields involved in the sum$")
    public void i_enter_values_into_the_fields() {
        page.enterValues();
    }

    @Then("^All values are displayed correctly in the Excel$")
    public void all_values_are_displayed_correctly() {
        Assert.assertTrue(page.areValuesDisplayedCorrectly());
    }

    @When("^I calculate the expected sum result and compare it with the displayed result$")
    public void i_calculate_the_expected_sum_result() {
        Assert.assertTrue(page.isSumResultCorrect());
    }

    @Then("^The resultant value is correct and consistent$")
    public void the_resultant_value_is_correct() {
        Assert.assertTrue(page.isResultConsistent());
    }
}