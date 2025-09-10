#author: Kevin Lopez
#lenguage: es

Feature: Validar correcto funcionamiento de SauceDemo

  Yo como kevin
  Quiero realizar una prueba de la pagina SauceDemo
  Para comprobar el funcionamiento y control de errores de la pagina web

  Background:
    Given "Kevin" abra la página principal

  Scenario: Valide la compra de la opcion Bike Light
    When ingrese la cuenta registrada
    And selecione la opcion Sauce Labs Bike Light
    Then realice la compra de la opcion seleccionada
    And valide que la compra sea efectiva

  Scenario: Valide la compra de la opcion Fleece Jacket
    When ingrese la cuenta registrada
    And selecione la opcion Sauce Labs Fleece Jacket
    Then realice la compra de la opcion seleccionada
    And valide que la compra sea efectiva
