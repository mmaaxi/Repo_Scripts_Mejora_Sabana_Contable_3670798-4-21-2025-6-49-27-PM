package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page = PageFactory.initElements(driver, tc_007Page.class);

    @Given("el usuario está en la página de facturación")
    public void el_usuario_esta_en_la_pagina_de_facturacion() {
        page.navigateToBillingPage();
    }

    @When("el sistema carga la tabla de facturas")
    public void el_sistema_carga_la_tabla_de_facturas() {
        page.loadInvoiceTable();
    }

    @Then("las columnas 'IVA exento' y 'IVA retenido' están visibles en la posición esperada")
    public void las_columnas_iva_exento_y_iva_retenido_estan_visibles_en_la_posicion_esperada() {
        page.verifyColumnPositions();
    }

    @Given("el usuario está en la tabla de facturación con columnas visibles")
    public void el_usuario_esta_en_la_tabla_de_facturacion_con_columnas_visibles() {
        page.verifyColumnVisibility();
    }

    @When("el usuario ingresa valores {string} para 'IVA exento' y {string} para 'IVA retenido'")
    public void el_usuario_ingresa_valores_para_iva_exento_y_para_iva_retenido(String ivExento, String ivRetenido) {
        page.enterTaxValues(ivExento, ivRetenido);
    }

    @Then("los datos se introducen sin errores")
    public void los_datos_se_introducen_sin_errores() {
        page.verifyNoEntryErrors();
    }

    @Given("el usuario ha ingresado los valores de IVA")
    public void el_usuario_ha_ingresado_los_valores_de_iva() {
        page.verifyDataEntry();
    }

    @When("el sistema calcula los montos asociados")
    public void el_sistema_calcula_los_montos_asociados() {
        page.calculateTaxAmounts();
    }

    @Then("los cálculos se realizan de forma correcta y se visualizan adecuadamente")
    public void los_calculos_se_realizan_de_forma_correcta_se_visualizan_adecuadamente() {
        page.verifyCorrectCalculations();
    }
}