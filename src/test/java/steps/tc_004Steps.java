package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("La columna 'Monto acumulado Folio Reserva 5401' está presente")
    public void laColumnaEstaPresente() {
        Assert.assertTrue(page.isMontoAcumuladoColumnPresent());
    }

    @When("Ingreso valores para el monto acumulado anterior y el monto actual")
    public void ingresoValoresParaElMontoAcumuladoAnteriorYElMontoActual() {
        page.enterPreviousAccumulatedAmount(1000);
        page.enterCurrentAmount(500);
    }

    @Then("El resultado de la suma es el correcto")
    public void elResultadoDeLaSumaEsElCorrecto() {
        Assert.assertEquals(1500, page.calculateAccumulatedAmount());
    }
}