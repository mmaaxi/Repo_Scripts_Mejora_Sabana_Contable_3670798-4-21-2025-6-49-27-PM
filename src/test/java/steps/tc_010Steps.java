import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el archivo Excel está preparado para exportación")
    public void setupExcelForExport() {
        page.prepareExcelForExport();
    }

    @When("ejecuto el proceso completo de exportación e importación")
    public void runFullExportImportProcess() {
        page.executeExportImportProcess();
    }

    @Then("el flujo completo se ejecuta sin errores")
    public void verifyNoErrorsInFlow() {
        Assert.assertTrue(page.isFlowErrorFree());
    }

    @Given("el archivo Excel ha sido modificado con nuevas entradas")
    public void modifyExcelWithNewEntries() {
        page.modifyExcelWithNewEntries();
    }

    @When("ejecuto la exportación nuevamente")
    public void reExportExcel() {
        page.reExportExcel();
    }

    @Then("el sistema no presenta errores y las mejoras se mantienen")
    public void verifySystemIntegrityAfterChanges() {
        Assert.assertTrue(page.isSystemStableAfterChanges());
    }

    @Given("el sistema está preparado con datos válidos y erróneos")
    public void setupSystemWithValidAndInvalidData() {
        page.setupSystemWithTestData();
    }

    @When("verifico la respuesta del sistema")
    public void verifySystemResponse() {
        page.verifySystemResponseToData();
    }

    @Then("el sistema responde de manera adecuada en todos los casos")
    public void validateSystemResponse() {
        Assert.assertTrue(page.isSystemResponseCorrect());
    }
}