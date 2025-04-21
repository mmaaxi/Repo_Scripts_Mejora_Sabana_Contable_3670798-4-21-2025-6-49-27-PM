Feature: Validar renombramiento de la columna 'Monto Acumulado Folio OPC' a 'Monto Acumulado Folio OPC (2121)'

  Scenario: Verificar renombramiento de la columna y funcionalidad asociada
    Given el usuario está en la página con la tabla de datos
    When el usuario revisa la cabecera de la columna renombrada
    Then el nombre de la columna es 'Monto Acumulado Folio OPC (2121)'
    And el cambio es visible y correcto
    And el cálculo y la presentación de datos son correctos