package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("el usuario navega a Canned Reports")
    public void el_usuario_navega_a_Canned_Reports() {
        page.navigateToCannedReports();
    }

    @When("selecciona Module Claim")
    public void selecciona_Module_Claim() {
        page.selectModuleClaim();
    }

    @When("selecciona Report Code")
    public void selecciona_Report_Code() {
        page.selectReportCode();
    }

    @When("genera el Claim Accounting Report")
    public void genera_el_Claim_Accounting_Report() {
        page.generateClaimAccountingReport();
    }

    @Then("el archivo Excel se descarga correctamente")
    public void el_archivo_Excel_se_descarga_correctamente() {
        Assert.assertTrue(page.isExcelDownloaded());
    }

    @Given("que el archivo Excel ha sido descargado")
    public void que_el_archivo_Excel_ha_sido_descargado() {
        Assert.assertTrue(page.isExcelDownloaded());
    }
    
    @When("el usuario abre el archivo Excel")
    public void el_usuario_abre_el_archivo_Excel() {
        page.openDownloadedExcel();
    }

    @Then("la estructura del Excel cumple con el formato esperado")
    public void la_estructura_del_Excel_cumple_con_el_formato_esperado() {
        Assert.assertTrue(page.isExcelStructureValid());
    }

    @Given("el archivo Excel está abierto")
    public void el_archivo_Excel_está_abierto() {
        Assert.assertTrue(page.isExcelOpen());
    }

    @When("el usuario revisa las columnas")
    public void el_usuario_revisa_las_columnas() {
        page.reviewExcelColumns();
    }

    @Then("todas las columnas están presentes y en el orden correcto")
    public void todas_las_columnas_están_presentes_y_en_el_orden_correcto() {
        Assert.assertTrue(page.areAllColumnsPresentAndCorrect());
    }
}