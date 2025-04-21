Feature: Validar fórmula del 'IVA Acumulado'

  Scenario: Verificar la columna y cálculos de IVA Acumulado en Excel
    Given la columna "IVA Acumulado" está presente
    When ingreso datos de prueba para IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO
    Then los datos se capturan adecuadamente
    And confirmo que la suma se realice correctamente excluyendo el IVA retenido
    Then el resultado cumple con lo definido