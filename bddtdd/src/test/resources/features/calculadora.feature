Feature: Calculadora
  Como usuario
  Quiero poder realizar operaciones matemáticas básicas
  Para obtener resultados correctos

  Scenario: Sumar dos números positivos
    Given tengo una calculadora
    When sumo 2 y 3
    Then el resultado debería ser 5
    
  Scenario: Sumar números negativos
    Given tengo una calculadora
    When sumo -2 y -3
    Then el resultado debería ser -5
    
  Scenario: Sumar número positivo y negativo
    Given tengo una calculadora
    When sumo 5 y -3
    Then el resultado debería ser 2
