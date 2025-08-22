#author: Kevin Lopez
#lenguage: es

Feature: Validar correcto funcionamiento de datepiker

  Yo como kevin
  Quiero realizar una prueba de la pagina JQuery Datepicker
  Para comprobar el funcionamiento y control de errores de la pagina web

  Background:
    Given "Kevin" abra la página principal

  Scenario: reserva de una cita seleccionando una fecha en el calendario
    When cambie al iframe del calendario
    Then seleccione el día 15 del mes actual
    And valide que la fecha es correcta "08/15/2025"

  Scenario: seleccione una fecha específica en un mes diferente
    When cambie al iframe del calendario
    Then seleccione el día 10 del mes siguiente
    And valide que la fecha es correcta "09/10/2025"

  Scenario: Validación de campo bloqueado al ingresar fecha
    When cambie al iframe del calendario
    Then ingrese una fecha en el campo
    And valide que no es posible seleccionar fecha
# El caso si recibe la fecha manualmente, al tomar el valor del campo retorna la fecha infresada