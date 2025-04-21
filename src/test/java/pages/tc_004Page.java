package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    private By accumulatedColumnLocator = By.xpath("//th[text()='Monto acumulado Folio Reserva 5401']");
    private By previousAccumulatedAmountInput = By.id("previousAccumulatedAmount");
    private By currentAmountInput = By.id("currentAmount");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMontoAcumuladoColumnPresent() {
        return driver.findElement(accumulatedColumnLocator).isDisplayed();
    }

    public void enterPreviousAccumulatedAmount(int amount) {
        driver.findElement(previousAccumulatedAmountInput).clear();
        driver.findElement(previousAccumulatedAmountInput).sendKeys(String.valueOf(amount));
    }

    public void enterCurrentAmount(int amount) {
        driver.findElement(currentAmountInput).clear();
        driver.findElement(currentAmountInput).sendKeys(String.valueOf(amount));
    }

    public int calculateAccumulatedAmount() {
        int previousAmount = Integer.parseInt(driver.findElement(previousAccumulatedAmountInput).getAttribute("value"));
        int currentAmount = Integer.parseInt(driver.findElement(currentAmountInput).getAttribute("value"));
        return previousAmount + currentAmount;
    }
}