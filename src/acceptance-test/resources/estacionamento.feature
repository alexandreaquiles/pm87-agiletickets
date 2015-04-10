# language: pt

Funcionalidade: Cadastro de Estacionamento
  Para oferecer serviços de táxi da minha outra empresa perto de onde é incoveniente ir de carro
  Como dono também de uma frota de táxis
  Quero poder cadastrar se um estabelecimento tem estacinamento 

  Cenário:
    Dado que o usuário abre a lista de estabelecimentos
    Quando o usuário preenche o formulário e marca que há estacionamento
    E clica em Adicionar
    Então a última linha da lista mostra que há estacionamento