package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ExcelUtils;

public class tc_006Page {

    WebDriver driver;
    ExcelUtils excelUtils;

    private By ivaColumnLocator = By.xpath("//th[contains(text(), 'IVA 0%')]");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        excelUtils = new ExcelUtils();
    }

    public void openExcelReport() {
        // Código para abrir el documento de Excel
    }

    public boolean isColumnIncluded() {
        try {
            WebElement column = driver.findElement(ivaColumnLocator);
            return column != null;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isColumnVisible() {
        // Lógica para verificar la visibilidad de la columna
        return driver.findElement(ivaColumnLocator).isDisplayed();
    }

    public boolean validateFieldValues() {
        // Lógica para validar que el campo acepte y muestre montos del 0% de IVA
        return excelUtils.checkFieldValues("IVA 0%");
    }

    public boolean areValuesDisplayedCorrectly() {
        // Lógica para verificar que los valores se muestren correctamente
        return excelUtils.verifyDisplayedValues("IVA 0%");
    }

    public void executeDataScenarioTests() {
        // Lógica para ejecutar pruebas con diferentes escenarios de datos
        excelUtils.runScenarioTests();
    }

    public boolean isColumnResponsiveUnderScenarios() {
        // Lógica para comprobar la respuesta de la columna bajo diferentes escenarios
        return excelUtils.isResponsive("IVA 0%");
    }
}