package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_007Page {
    WebDriver driver;

    @FindBy(id = "billing-table")
    WebElement billingTable;

    @FindBy(xpath = "//th[contains(text(), 'IVA exento')]")
    WebElement ivaExentoColumn;

    @FindBy(xpath = "//th[contains(text(), 'IVA retenido')]")
    WebElement ivaRetenidoColumn;

    @FindBy(id = "input-iva-exento")
    WebElement inputIvaExento;

    @FindBy(id = "input-iva-retenido")
    WebElement inputIvaRetenido;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToBillingPage() {
        driver.get("https://example.com/billing");
    }

    public void loadInvoiceTable() {
        // Wait for table to load or ensure it’s loaded
    }

    public void verifyColumnPositions() {
        // Logic to verify if columns are in the correct order
    }

    public void verifyColumnVisibility() {
        // Verify if both columns are visible
    }

    public void enterTaxValues(String ivaExento, String ivaRetenido) {
        inputIvaExento.sendKeys(ivaExento);
        inputIvaRetenido.sendKeys(ivaRetenido);
    }

    public void verifyNoEntryErrors() {
        // Verify no errors occurred during entry
    }

    public void verifyDataEntry() {
        // Check if data is entered correctly
    }

    public void calculateTaxAmounts() {
        // Logic for calculating taxes
    }

    public void verifyCorrectCalculations() {
        // Verify the calculations and display are accurate
    }
}