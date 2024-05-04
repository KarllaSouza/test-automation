#language: pt

  @cadastro
  Funcionalidade: Cadastro de Usuário
    Eu como usuário quero me cadastrar no site para poder realizar compras.

    @cadastro_sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado acessei a tela de cadastro de usuário
      Quando eu preencher o formulário de cadastro
      E clicar em cadastrar
      Entao devo ver a mensagem de cadastro realizado com sucesso