package pages;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import runner_files.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {
    private By emailField = By.id("user");
    private By passwordField = By.id("password");
    private By loginButton = By.id("btnLogin");
    private By messageSuccessLogin = By.id("swal2-title");


    public void siteAccess() throws InterruptedException {
        getDriver().get("https://automationpratice.com.br/");
        Thread.sleep(100);
    }

    public void loginScreenAccess(){
        getDriver().findElement(By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a")).click();
        Utils.waitElementBePresent(emailField,150);
        Assert.assertTrue(getDriver().findElement(By.id("user")).isDisplayed());
        Assert.assertTrue(getDriver().findElement(By.id("password")).isDisplayed());
    }

    public void fillEmail(String email){
        getDriver().findElement(emailField).sendKeys(email);
    }

    public void fillPassword(String password){
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(600);
        getDriver().findElement(loginButton).click();
    }

    public void modalSuccessLogin() throws InterruptedException {
        Utils.waitElementBePresent(messageSuccessLogin,300);
        Assert.assertTrue(getDriver().findElement(By.id("swal2-html-container")).isDisplayed());

        String messageSuccessLoginSite = getDriver().findElement(messageSuccessLogin).getText();
        Assertions.assertThat(messageSuccessLoginSite).isNotBlank();
        Assert.assertTrue(messageSuccessLoginSite.contains("Login realizado"));

        Assert.assertTrue(getDriver().findElement(By.className("swal2-confirm")).isDisplayed());
        Thread.sleep(100);
    }
}
