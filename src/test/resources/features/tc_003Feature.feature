Feature: Validar inclusión y posición de la columna 'Estado Código'

  Scenario: Verificar la colocación y funcionalidad de la columna 'Estado Código'
    Given el usuario está en la página de análisis de datos
    When el usuario verifica que la columna 'Estado Código' está a la derecha de la columna 'i'
    Then la columna 'Estado Código' aparece en la posición correcta

    When el usuario revisa la información en la columna 'Estado Código'
    Then la información del estado se visualiza correctamente
    
    When el usuario realiza pruebas de visualización y exportación
    Then la columna 'Estado Código' responde correctamente según los requerimientos