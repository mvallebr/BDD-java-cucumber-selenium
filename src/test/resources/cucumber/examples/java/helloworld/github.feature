Feature: Busca Github

  Scenario: Busca por usuario
    Given Eu estou no site "http://github.com"
    When Eu procuro por "cucumber"
    And Eu clico no link com descricao "cucumber"
    Then Eu deveria encontrar um link com descricao "cucumber-jvm"
    
  Scenario: Busca por projeto
    Given Eu estou no site "http://github.com"
    When Eu procuro por "cucumber"    
    Then Eu deveria encontrar um link com descricao "cucumber / cucumber"
  