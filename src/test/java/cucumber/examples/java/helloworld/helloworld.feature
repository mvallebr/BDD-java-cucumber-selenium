Feature: Oi mundo

  Scenario: Diga oi
    Given Minha saudacao e "Oi"
    When Eu executo minha aplicacao
    Then Ela deveria responder com "Oi mundo"
