package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    private By emailField = By.id("user");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void siteAccess() {
        driver.get("https://automationpratice.com.br/");
    }

    public void loginScreenAccess(){
        //driver.get("https://automationpratice.com.br/login");
        driver.findElement(By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a")).click();
        waitElementBePresent(emailField,150);
        Assert.assertTrue(driver.findElement(By.id("user")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
    }
}
