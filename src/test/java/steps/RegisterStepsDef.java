package steps;

import io.cucumber.java.pt.*;
import pages.RegisterPage;
import runner.RunCucumberTest;

public class RegisterStepsDef extends RunCucumberTest {

    RegisterPage registerPage = new RegisterPage(driver);

    @Dado("acessei a tela de cadastro de usuário")
    public void acessoTelaCadastroDeUsuario() {
        registerPage.registerScreenAccess();
    }
    @Quando("eu preencher o formulário de cadastro")
    public void preencherFormularioDeCadastro() {
        registerPage.fillEmailCreate();
    }
    @E("clicar em cadastrar")
    public void clicarEmCadastrar() throws InterruptedException {
        registerPage.clickCreateUserButton();
    }
    @Entao("devo ver a mensagem de cadastro realizado com sucesso")
    public void verMensagemDeCadastroComSucesso() {

    }
}
