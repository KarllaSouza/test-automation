package pages;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import main.RunCucumberTest;
import support.Utils;

public class RegisterPage extends RunCucumberTest {

    String email = Utils.getRandomEmail();
    String nameOfUser = Utils.getRandomUserName();

    private By createUserNameField = By.id("user");
    private By createEmailField = By.id("email");
    private By createPasswordField = By.id("password");
    private By createUserButton = By.id("btnRegister");
    private By successCreateIcon = By.className("swal2-success-ring");
    private By successCreateMessage = By.id("swal2-title");
    private By successCreateMessageWelcome = By.id("swal2-html-container");
    private By successCreateModalButton = By.className("swal2-actions");
    private By accountArea = By.id("my-account_area");

    public void registerScreenAccess() {
        getDriver().get("https://automationpratice.com.br/register");
    }

    public void fillUserNameCreate(String userName) {
        Utils.waitElementBePresent(createEmailField,300);
        String finalName = StringUtils.isBlank(userName) ? nameOfUser : userName;
        getDriver().findElement(createUserNameField).sendKeys(finalName);
    }

    public void fillEmailCreate() {
        getDriver().findElement(createEmailField).sendKeys(email);
    }

    public void fillPasswordCreate() {
        getDriver().findElement(createPasswordField).sendKeys(Utils.getRandomPassword());
    }

    public void clickCreateUserButton() throws InterruptedException {
        Thread.sleep(300);
        getDriver().findElement(createUserButton).click();
    }

    public void checkTheUser(String userName){
        String userLogged = getDriver().findElement(By.id("userLogged")).getText();
        String finalName = StringUtils.isBlank(userName) ? nameOfUser : userName;
        Assert.assertEquals(finalName, userLogged);
    }

    public void successRegisterMessage() {
        Utils.waitElementBePresent(successCreateIcon, 100);
        Assertions.assertThat(successCreateMessage.equals("Cadastro realizado!"));
        Assert.assertTrue(getDriver().findElement(successCreateMessageWelcome).isDisplayed());

        String messageWelcomeSite = getDriver().findElement(successCreateMessageWelcome).getText();
        Assert.assertTrue(messageWelcomeSite.contains("Bem-vindo"));

        Assert.assertTrue(getDriver().findElement(successCreateModalButton).isDisplayed());

        getDriver().findElement(successCreateModalButton).click();
        Utils.waitElementBePresent(accountArea, 100);
        Assert.assertTrue(getDriver().findElement(accountArea).isDisplayed());
    }

}
