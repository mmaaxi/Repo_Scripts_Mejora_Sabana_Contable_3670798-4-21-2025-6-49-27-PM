package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page ivaPage = new tc_006Page();

    @Given("el usuario navega al documento Excel con el reporte")
    public void elUsuarioNavegaAlDocumentoExcelConElReporte() {
        ivaPage.openExcelReport();
    }

    @When("el usuario revisa la inclusión de la columna 'IVA 0%' en la posición indicada")
    public void elUsuarioRevisaLaInclusiónDeLaColumnaIVA0() {
        Assert.assertTrue("La columna 'IVA 0%' no está incluida", ivaPage.isColumnIncluded());
    }

    @Then("la columna 'IVA 0%' debería visualizarse en el Excel")
    public void laColumnaIVA0DeberíaVisualizarseEnElExcel() {
        Assert.assertTrue("La columna 'IVA 0%' no se visualiza correctamente", ivaPage.isColumnVisible());
    }

    @When("el usuario verifica que el campo acepte y muestre los montos aplicables a la tasa del 0% de IVA")
    public void elUsuarioVerificaElCampoParaTasaIVA0() {
        Assert.assertTrue("El campo no acepta o muestra correctamente los montos de IVA 0%", ivaPage.validateFieldValues());
    }

    @Then("los valores deben mostrarse correctamente en la columna 'IVA 0%'")
    public void losValoresDebenMostrarseCorrectamenteEnLaColumnaIVA0() {
        Assert.assertTrue("Los valores no se muestran correctamente", ivaPage.areValuesDisplayedCorrectly());
    }

    @When("el usuario ejecuta pruebas con diferentes escenarios de datos")
    public void elUsuarioEjecutaPruebasConDiferentesEscenarios() {
        ivaPage.executeDataScenarioTests();
    }

    @Then("la columna 'IVA 0%' debería responder adecuadamente a todos los escenarios")
    public void laColumnaIVA0DeberíaResponderAdecuadamente() {
        Assert.assertTrue("La columna no responde adecuadamente a todos los escenarios", ivaPage.isColumnResponsiveUnderScenarios());
    }
}