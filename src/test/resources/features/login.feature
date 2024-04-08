#language: pt

  @login
  Funcionalidade: Login de Usuário
    Eu como usuário quero realizar login para acessar as funcionalidades do site

    @login_sucesso
    Cenario: Realizar login com sucesso
      Dado que acessei o site
      E que acessei a tela de login
      Quando eu preencher as credenciais
      E clicar para realizar login
      Então devo ver a mensagem de login realizado com sucesso
