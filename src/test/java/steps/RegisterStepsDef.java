package steps;

import io.cucumber.java.pt.*;
import pages.RegisterPage;
import runner_files.RunCucumberTest;

public class RegisterStepsDef extends RunCucumberTest {

    RegisterPage registerPage = new RegisterPage();
    String userName;

    @Dado("acessei a tela de cadastro de usuário")
    public void accessTheUserRegisterScreen() {
        registerPage.registerScreenAccess();
    }
    @Quando("eu preencher o formulário de cadastro")
    public void fillInTheRegisterForm() {
        registerPage.fillUserNameCreate(userName);
        registerPage.fillEmailCreate();
        registerPage.fillPasswordCreate();
    }
    @E("clicar em cadastrar")
    public void clickToRegister() throws InterruptedException {
        registerPage.clickCreateUserButton();
    }
    @Entao("devo ver a mensagem de cadastro realizado com sucesso")
    public void seeTheSuccessRegisterMessage() {
        registerPage.successRegisterMessage();
        registerPage.checkTheUser(userName);
    }
}
