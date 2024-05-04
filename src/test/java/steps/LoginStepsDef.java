package steps;

import io.cucumber.java.pt.*;
import pages.LoginPage;
import runner_files.RunBase;
import runner_files.RunCucumberTest;

public class LoginStepsDef extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("que abri um navegador chrome")
    public void openBrowserChrome() {
        getDriver(RunBase.Browser.CHROME);
    }

    @Dado("que abri um navegador firefox")
    public void openBrowserFirefox() {
        getDriver(RunBase.Browser.FIREFOX);
    }

    @E("acessei o site")
    public void accessTheSite() throws InterruptedException {
        loginPage.siteAccess();
    }

    @E("que acessei a tela de login")
    public void accessTheLoginScreen() {
        loginPage.loginScreenAccess();
    }

    @Quando("eu preencher as credenciais")
    public void fillInTheLoginFields(){
        loginPage.fillEmail("projectautomation_9887@souza.com.br");
        loginPage.fillPassword("12345678");
    }

    @E("clicar para realizar login")
    public void ClickToDoLogin() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Entao("devo ver um modal com a mensagem de login realizado com sucesso")
    public void seeTheSuccessLoginMessage() throws InterruptedException {
        loginPage.modalSuccessLogin();
    }

}
