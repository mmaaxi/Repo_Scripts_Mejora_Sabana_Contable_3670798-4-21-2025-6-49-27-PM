package steps;

import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario está en la página de análisis de datos")
    public void el_usuario_esta_en_la_pagina_de_analisis_de_datos() {
        page.navigateToDataAnalysisPage();
    }

    @When("el usuario verifica que la columna 'Estado Código' está a la derecha de la columna 'i'")
    public void el_usuario_verifica_la_columna_posicion() {
        assertTrue(page.isEstadoCodigoColumnInCorrectPosition());
    }

    @Then("la columna 'Estado Código' aparece en la posición correcta")
    public void la_columna_aparece_en_la_posicion_correcta() {
        // Check position correctness
    }
    
    @When("el usuario revisa la información en la columna 'Estado Código'")
    public void el_usuario_revisa_informacion_en_columna() {
        assertTrue(page.isEstadoCodigoInfoCorrect());
    }

    @Then("la información del estado se visualiza correctamente")
    public void la_informacion_se_visualiza_correctamente() {
        // Check information correctness
    }
    
    @When("el usuario realiza pruebas de visualización y exportación")
    public void el_usuario_realiza_pruebas_visualizacion_exportacion() {
        assertTrue(page.isVisualizationAndExportSuccessful());
    }

    @Then("la columna 'Estado Código' responde correctamente según los requerimientos")
    public void la_columna_responde_correctamente() {
        // Confirm response behavior
    }
}