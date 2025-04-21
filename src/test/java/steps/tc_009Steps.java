import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_009Steps {

    private tc_009Page ivaPage = new tc_009Page();

    @Given("la columna {string} está presente")
    public void verificarColumnaPresente(String columna) {
        Assert.assertTrue(ivaPage.isColumnaPresente(columna));
    }

    @When("ingreso datos de prueba para IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO")
    public void ingresarDatosDePrueba() {
        ivaPage.ingresarDatosIVA("IVA16%");
        ivaPage.ingresarDatosIVA("IVAFRONTERIZO");
        ivaPage.ingresarDatosIVA("IVA0%");
        ivaPage.ingresarDatosIVA("IVAEXENTO");
    }

    @Then("los datos se capturan adecuadamente")
    public void verificarCapturaDeDatos() {
        Assert.assertTrue(ivaPage.verificarCapturaDatos());
    }

    @Then("confirmo que la suma se realice correctamente excluyendo el IVA retenido")
    public void confirmarCalculo() {
        Assert.assertTrue(ivaPage.calculoCorrectoExcluyendoRetenido());
    }

    @Then("el resultado cumple con lo definido")
    public void verificarResultadoCumple() {
        Assert.assertTrue(ivaPage.verificarResultadoCumple());
    }
}