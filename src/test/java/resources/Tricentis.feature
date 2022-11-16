@Regressivo
Feature: cotacao veicular
  eu como usuario quero acessar o  site para fazer cadatro e uma cotacao de preco


  Background:
    Given que eu esteja no site da tricentis

  Scenario: efetuar cadastro

    When eu preecher os dados requeridos
    And clico em proximo
    Then sou direcionado para preecher dados pessoais

