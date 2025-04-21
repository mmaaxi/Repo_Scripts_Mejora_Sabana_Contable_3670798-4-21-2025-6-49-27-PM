Feature: Validar inclusión de la columna 'IVA 0%'

  Scenario: Verificar la columna 'IVA 0%' y su funcionalidad
    Given el usuario navega al documento Excel con el reporte
    When el usuario revisa la inclusión de la columna 'IVA 0%' en la posición indicada
    Then la columna 'IVA 0%' debería visualizarse en el Excel
    When el usuario verifica que el campo acepte y muestre los montos aplicables a la tasa del 0% de IVA
    Then los valores deben mostrarse correctamente en la columna 'IVA 0%'
    When el usuario ejecuta pruebas con diferentes escenarios de datos
    Then la columna 'IVA 0%' debería responder adecuadamente a todos los escenarios