package pages;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class RegisterPage extends Utils {

    WebDriver driver;

    private By createUserNameField = By.id("user");
    private By createEmailField = By.id("email");
    private By createPasswordField = By.id("password");
    private By createUserButton = By.id("btnRegister");
    private By successCreateIcon = By.className("swal2-success-ring");
    private By successCreateMessage = By.id("swal2-title");
    private By successCreateMessageWelcome = By.id("swal2-html-container");
    private By successCreateModalButton = By.className("swal2-actions");
    private By accountArea = By.id("my-account_area");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerScreenAccess(){
        driver.get("https://automationpratice.com.br/register");
    }

    public void fillUserNameCreate(String userName){
        waitElementBePresent(createEmailField,300);
        driver.findElement(createUserNameField).sendKeys(userName);
    }

    public void fillEmailCreate(){
        driver.findElement(createEmailField).sendKeys(getRandomEmail());
    }

    public void fillPasswordCreate(){
        driver.findElement(createPasswordField).sendKeys(getRandomPassword());
    }

    public void clickCreateUserButton() throws InterruptedException {
        Thread.sleep(300);
        driver.findElement(createUserButton).click();
    }

    public void successRegisterMessage () {
        waitElementBePresent(successCreateIcon, 100);
        Assertions.assertThat(successCreateMessage.equals("Cadastro realizado!"));
        Assert.assertTrue(driver.findElement(successCreateMessageWelcome).isDisplayed());

        String messageWelcomeSite = driver.findElement(successCreateMessageWelcome).getText();
        Assert.assertTrue(messageWelcomeSite.contains("Bem-vindo"));

        Assert.assertTrue(driver.findElement(successCreateModalButton).isDisplayed());

        driver.findElement(successCreateModalButton).click();
        waitElementBePresent(accountArea, 100);
        Assert.assertTrue(driver.findElement(accountArea).isDisplayed());
    }

}
