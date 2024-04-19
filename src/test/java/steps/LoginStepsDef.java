package steps;

import io.cucumber.java.pt.*;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginStepsDef extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("que acessei o site")
    public void acessoAoSite() throws InterruptedException {
        loginPage.siteAccess();
    }

    @E("que acessei a tela de login")
    public void acesseiTelaDeLogin() {
        loginPage.loginScreenAccess();
    }

    @Quando("eu preencher as credenciais")
    public void preencherCredenciais(){
        loginPage.fillEmail();
        loginPage.fillPassword();
    }

    @E("clicar para realizar login")
    public void clicarParaRealizarLogin() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Entao("devo ver um modal com a mensagem de login realizado com sucesso")
    public void verMensagemDeLoginComSucesso() throws InterruptedException {
        loginPage.modalSuccessLogin();
    }




}
