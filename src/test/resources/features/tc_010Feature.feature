Feature: Pruebas de integración y regresión

  Scenario: Ejecutar el flujo completo desde la exportación del Excel hasta la importación de datos en otros módulos
    Given el archivo Excel está preparado para exportación
    When ejecuto el proceso completo de exportación e importación
    Then el flujo completo se ejecuta sin errores

  Scenario: Realizar modificaciones en el Excel y probar nuevamente la exportación
    Given el archivo Excel ha sido modificado con nuevas entradas
    When ejecuto la exportación nuevamente
    Then el sistema no presenta errores y las mejoras se mantienen

  Scenario: Verificar la respuesta del sistema ante datos válidos y erróneos en escenarios de integración
    Given el sistema está preparado con datos válidos y erróneos
    When verifico la respuesta del sistema
    Then el sistema responde de manera adecuada en todos los casos