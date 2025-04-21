package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page page = new tc_005Page(driver);

    @Given("el usuario está en la página con la tabla de datos")
    public void el_usuario_está_en_la_página_con_la_tabla_de_datos() {
        page.navigateToDataTablePage();
    }

    @When("el usuario revisa la cabecera de la columna renombrada")
    public void el_usuario_revisa_la_cabecera_de_la_columna_renombrada() {
        page.inspectColumnHeader();
    }
    
    @Then("el nombre de la columna es 'Monto Acumulado Folio OPC \\(2121\\)'")
    public void el_nombre_de_la_columna_es() {
        String expectedHeaderName = "Monto Acumulado Folio OPC (2121)";
        String actualHeaderName = page.getColumnHeaderName();
        Assert.assertEquals(expectedHeaderName, actualHeaderName);
    }

    @Then("el cambio es visible y correcto")
    public void el_cambio_es_visible_y_correcto() {
        Assert.assertTrue(page.isColumnRenamingCorrect());
    }

    @Then("el cálculo y la presentación de datos son correctos")
    public void el_cálculo_y_la_presentación_de_datos_son_correctos() {
        Assert.assertTrue(page.isFormulaFunctionalityUnaffected());
    }
}