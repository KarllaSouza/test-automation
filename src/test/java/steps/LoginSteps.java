package steps;

import io.cucumber.java.pt.*;
import io.opentelemetry.api.internal.Utils;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("que acessei o site")
    public void acessoAoSite(){
        loginPage.siteAccess();
    }

    @E("que acessei a tela de login")
    public void acesseiTelaDeLogin() {
        loginPage.loginScreenAccess();
    }

    @Quando("eu preencher as credenciais")
    public void preencherCredenciais(){

    }

    @E("clicar para realizar login")
    public void clicarParaRealizarLogin(){

    }

    @Entao("devo ver a mensagem de login realizado com sucesso")
    public void verMensagemDeLoginComSucesso(){

    }

}
