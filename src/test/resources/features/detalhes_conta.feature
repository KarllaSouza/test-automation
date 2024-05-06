#language: pt

  @editar_dados
  Funcionalidade: Editar dados do usuário
    Eu como usuário quero acessar a tela de detalhes da minha conta para atualizar os dados cadastrados

    Contexto: Acessar tela de atualização de dados da conta do usuário
      Dado que estou logado no sistema
      E cliquei em Account Details
      E cliquei em Update Account
      E foi carregada a tela de edicao dos dados do usuario

    @edicao_dados_sucesso
    Cenario: Atualizar os dados da conta do usuário com sucesso
      Quando informar dados novos nos campos apresentados
      E clicar em Update Information
      Então os novos dados devem ser salvos
      E o usuario deve retornar para a tela de detalhamento da conta
      E uma mensagem de sucesso deve ser exibida

    @edicao_foto_sucesso
    Cenario: Atualizar foto da conta do usuário com sucesso
      Quando inserir uma imagem
      E clicar em Update Information
      Então a imagem deve ser salva como foto do usuario
      E o usuario deve retornar para a tela de detalhamento da conta
      E uma mensagem de sucesso deve ser exibida