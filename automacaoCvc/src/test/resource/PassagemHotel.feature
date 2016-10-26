Feature: Compra de passagem mas hotel
  Para quando uma viagem for solicitada
  Eu, como vendedor
  Desejo que a venda seja concluida

  Scenario: Prencher tela inicial do site e clicar no botão de confirmação
    Given Estou no site da cvc
    When Preencho a localização do Estado que sairei para a viagem
    And Preencho o local onde passarei a viagem
    And Preencho a data de saida
    And Preencho a data de volta
    And Preencho a quantidade quartos preciso na viagem
    And Preencho a quanitdade de adultos que irão na viagem
    And Preencho a quantidade de crianças que irão na viagem
    And Preesione o botão de buscar demostrando interesse na viagem
    Then Mostra tela de escolha de hotel e empresa aerea

  Scenario: Escolher hotel e empresa aerea solicitada
    Given
    When
    Then


  Scenario: Preencher dados de compra do cliente e de todos os hospedes
    Given
    When

    Then Sistema exibe numero de reserva
