package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_008Page {

    WebDriver driver = DriverFactory.getDriver();

    private By formulaField = By.id("formula_field_2121");
    private By[] valueFields = {
        By.id("value_z4"),
        By.id("value_ad5"),
        By.id("value_ae5"),
        By.id("value_ah5"),
        By.id("value_ac5"),
        By.id("value_ab5"),
        By.id("value_am5")
    };
    
    public void openExcelSheet() {
        driver.get("http://excel-sheet-url.com");
    }

    public boolean isFormulaUpdated() {
        WebElement formulaElement = driver.findElement(formulaField);
        String formulaText = formulaElement.getAttribute("value");
        return formulaText.contains("Z4+AD5+AE5+AH5+AC5+AB5+AM5");
    }

    public boolean isFormulaCorrect() {
        // Logic to check if the formula in the Excel sheet matches the provided string
        WebElement formulaElement = driver.findElement(formulaField);
        String formulaText = formulaElement.getAttribute("value");
        return formulaText.equals("Z4+AD5+AE5+AH5+AC5+AB5+AM5");
    }

    public void enterValues() {
        for (By by : valueFields) {
            WebElement valueField = driver.findElement(by);
            valueField.clear();
            valueField.sendKeys("1"); // Example value entry
        }
    }

    public boolean areValuesDisplayedCorrectly() {
        for (By by : valueFields) {
            WebElement valueField = driver.findElement(by);
            if (!valueField.getAttribute("value").equals("1")) { // Ensure the value is the same
                return false;
            }
        }
        return true;
    }

    public boolean isSumResultCorrect() {
        // Logic to calculate expected result and compare with actual excel result
        int expectedSum = 7; // As example considering entered values
        WebElement resultField = driver.findElement(By.id("result_field"));
        int actualResult = Integer.parseInt(resultField.getAttribute("value"));
        return expectedSum == actualResult;
    }

    public boolean isResultConsistent() {
        return isSumResultCorrect();
    }
}