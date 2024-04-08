package pages;

import org.openqa.selenium.WebDriver;

public class TelaLogin {
    WebDriver driver;

    public TelaLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void acessoAoSite() {
        driver.get("https://automationpratice.com.br/");
    //    Assert.assertTrue(driver.findElement(By.id("user_email")).isDisplayed());
    //    Assert.assertTrue(driver.findElement(By.id("user_password")).isDisplayed());
    }
}
