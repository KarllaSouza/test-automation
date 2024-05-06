package steps;

import io.cucumber.java.pt.*;
import pages.AccountEditPage;
import runner.RunCucumberTest;

public class AccountDatailsStepsDef extends RunCucumberTest {

    AccountEditPage accountEditPage = new AccountEditPage();

    @Dado("que estou logado no sistema")
    public void loggedUserScreen() throws InterruptedException {
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
    public void informar_dados_novos_nos_campos_apresentados() {}

    @E("clicar em Update Information")
    public void clicar_em_update_information() {}

    @Então("os novos dados devem ser salvos")
    public void os_novos_dados_devem_ser_salvos() {}

    @E("o usuario deve retornar para a tela de detalhamento da conta")
    public void o_usuario_deve_retornar_para_a_tela_de_detalhamento_da_conta() {}

    @E("uma mensagem de sucesso deve ser exibida")
    public void uma_mensagem_de_sucesso_deve_ser_exibida() {}

    @Quando("inserir uma imagem")
    public void inserir_uma_imagem() {}

    @Então("a imagem deve ser salva como foto do usuario")
    public void a_imagem_deve_ser_salva_como_foto_do_usuario() {}


}
