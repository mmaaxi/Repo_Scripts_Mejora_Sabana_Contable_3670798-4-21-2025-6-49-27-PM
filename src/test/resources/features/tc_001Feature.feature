Feature: Validar exportación y formato del Excel

  Scenario: Verificación de la exportación y estructura del Excel
    Given el usuario navega a Canned Reports
    When selecciona Module Claim
    And selecciona Report Code
    And genera el Claim Accounting Report
    Then el archivo Excel se descarga correctamente

  Scenario: Verificación de la estructura general del documento
    Given que el archivo Excel ha sido descargado
    When el usuario abre el archivo Excel
    Then la estructura del Excel cumple con el formato esperado

  Scenario: Confirmación de columnas requeridas
    Given el archivo Excel está abierto
    When el usuario revisa las columnas
    Then todas las columnas están presentes y en el orden correcto