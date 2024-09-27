
@funcionalTest
Feature: Title of your feature
  I want to use this template for my feature file

  @TestSuma
  Scenario: Add two numbers
    Given the calculator is run
    When the input is "5+5"
    Then the output should be "10"
    And the console shows "La pantalla muestra 10"

@TestResta
	Scenario: Subtract two numbers
    Given the calculator is rUn
    When The input "5-3"
    Then the output should Be "2"
    And the console shoWs "La pantalla muestra 2"

@TestMultiplicacion
	Scenario: Multiply two numbers
    Given the calculator es run
    When the input "5*5"
    Then the output should bE "25"
    And the console showS "La pantalla muestra 25"
    
@TestDivision
	Scenario: Divide two numbers
    Given the calculator is ruN
    When the input IS "10/2"
    Then the output should BE "5"
    And The console shows "La pantalla muestra 5"