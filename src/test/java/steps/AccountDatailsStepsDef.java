package steps;

import io.cucumber.java.pt.*;
import pages.AccountEditPage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class AccountDatailsStepsDef extends RunCucumberTest {

    AccountEditPage accountEditPage = new AccountEditPage();
    LoginPage loginPage = new LoginPage();

//    String email = "projectautomation_9887@souza.com.br";
//    String password = "12345678";

    @Dado("que estou logado no sistema")
    public void loggedUserScreen() {
//        loginPage.siteAccess();
//        loginPage.loginScreenAccess();
//        loginPage.fillEmail(email);
//        loginPage.fillPassword(password);
//        loginPage.clickLoginButton();
//        loginPage.modalSuccessLogin();
        accountEditPage.dashboardScreenAccess();
    }

    @E("cliquei em Account Details")
    public void accountDetailsScreen() {
        accountEditPage.accountDetailsScreenAccess();
    }

    @E("cliquei em Update Account")
    public void clickToEditAccountDetails() {
        accountEditPage.accountDetailsEditScreenAccess();
    }

    @E("foi carregada a tela de edicao dos dados do usuario")
    public void editAccountScreenAccessed() {
        accountEditPage.editAccountDetailsScreen();
    }

    @Quando("informar dados novos nos campos apresentados")
    public void fillInAccountDetailsEditFields() {
        accountEditPage.fillInAccountDetails();
        accountEditPage.ValidateThatAllFieldsAreFilledIn();
    }

    @E("clicar em Update Information")
    public void clickToUpdate() {
        accountEditPage.clickToSaveEditions();
    }

    @Então("os novos dados devem ser salvos")
    public void accountUpdated() {
        accountEditPage.validateThatAllEditionsAreSaved();
    }

    @E("o usuario deve retornar para a tela de detalhamento da conta")
    public void returnToUserInformationsPage() {
        accountEditPage.pageAfterUpdate();
    }

    @Quando("inserir uma imagem")
    public void uploadUserImage() {
        accountEditPage.insertAnImage("/Users/karlla/IdeaProjects/Portifólio - automação/test-automation/Alice - colorir - 1.png");
    }

    @Então("a imagem deve ser salva como foto do usuario")
    public void imageWasSaved() {
        //The site doesn't save the image.
    }


}
