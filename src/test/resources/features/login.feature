#language: pt

  @login
  Funcionalidade: Login de Usuário
    Eu como usuário quero realizar login para acessar as funcionalidades do site

    @login_sucesso
    Cenario: Realizar login com sucesso
      Dado que abri um navegador chrome
      E acessei o site
      E que acessei a tela de login
      Quando eu preencher as credenciais
      E clicar para realizar login
      Então devo ver um modal com a mensagem de login realizado com sucesso


    @login_sucesso2
    Cenario: Realizar login com sucesso 2
      Dado que abri um navegador firefox
      E acessei o site
      E que acessei a tela de login
      Quando eu preencher as credenciais
      E clicar para realizar login
      Então devo ver um modal com a mensagem de login realizado com sucesso