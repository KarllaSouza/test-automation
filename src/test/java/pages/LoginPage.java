package pages;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    private By emailField = By.id("user");
    private By passwordField = By.id("password");
    private By loginButton = By.id("btnLogin");
    private By messageSuccessLogin = By.id("swal2-title");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void siteAccess() throws InterruptedException {
        driver.get("https://automationpratice.com.br/");
        Thread.sleep(500);
    }

    public void loginScreenAccess(){
        driver.findElement(By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a")).click();
        waitElementBePresent(emailField,150);
        Assert.assertTrue(driver.findElement(By.id("user")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
    }

    public void fillEmail(){
        driver.findElement(emailField).sendKeys("projectautomation_9887@souza.com.br");
    }

    public void fillPassword(){
        driver.findElement(passwordField).sendKeys("12345678");
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(800);
        driver.findElement(loginButton).click();
    }

    public void modalSuccessLogin() throws InterruptedException {
        waitElementBePresent(messageSuccessLogin,300);
        Assert.assertTrue(driver.findElement(By.id("swal2-html-container")).isDisplayed());
        //Assertions.assertThat(messageSuccessLogin).isNotBlank();
        Assertions.assertThat(messageSuccessLogin.equals("Login realizado"));
        //Assert.assertEquals(true, messageSuccessLogin.contains("Login realizado"));
        Assert.assertTrue(driver.findElement(By.className("swal2-confirm")).isDisplayed());
        Thread.sleep(500);
    }
}
