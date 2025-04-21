Feature: Validar fórmula 'Monto acumulado Folio Reserva 5401'
  Como usuario del sistema
  Quiero validar la fórmula del Monto acumulado Folio Reserva 5401
  Para asegurarme de que los cálculos son correctos

  Scenario: Verificar columna y cálculo de monto acumulado
    Given La columna 'Monto acumulado Folio Reserva 5401' está presente
    When Ingreso valores para el monto acumulado anterior y el monto actual
    Then El resultado de la suma es el correcto