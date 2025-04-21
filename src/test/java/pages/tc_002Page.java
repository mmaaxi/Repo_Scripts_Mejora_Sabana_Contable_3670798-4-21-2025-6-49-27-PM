package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By formulaCell = By.xpath("//some_locator_for_formula_cell");
    By dataCells = By.xpath("//locator_for_data_cells");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openSpreadsheet() {
        driver.get("URL_OF_SPREADSHEET");
    }

    public boolean isFormulaCorrect() {
        String actualFormula = driver.findElement(formulaCell).getAttribute("value");
        return actualFormula.equals("=CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)");
    }

    public String getFormulaInColumnC() {
        return driver.findElement(formulaCell).getAttribute("value");
    }

    public void enterTestData() {
        // Implement method to enter test data in cells D, H, U, O, and E
    }

    public boolean isTestDataDisplayedCorrectly() {
        // Implement verification of test data display
        return true; // Placeholder 
    }

    public boolean isConcatenationCorrect() {
        // Implement logic to verify correct concatenation
        return true; // Placeholder
    }
}