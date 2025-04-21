Feature: Validar inclusión de columnas 'IVA exento' y 'IVA retenido'

  Scenario: Confirmar que las columnas 'IVA exento' y 'IVA retenido' estén presentes y en el orden correcto
    Given el usuario está en la página de facturación
    When el sistema carga la tabla de facturas
    Then las columnas 'IVA exento' y 'IVA retenido' están visibles en la posición esperada

  Scenario: Ingresar datos representativos para IVA exento y valor retenido
    Given el usuario está en la tabla de facturación con columnas visibles
    When el usuario ingresa valores "1000" para 'IVA exento' y "150" para 'IVA retenido'
    Then los datos se introducen sin errores

  Scenario: Verificar el cálculo y la visualización de los montos para cada caso de IVA
    Given el usuario ha ingresado los valores de IVA
    When el sistema calcula los montos asociados
    Then los cálculos se realizan de forma correcta y se visualizan adecuadamente