package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class RegisterPage extends Utils {

    WebDriver driver;

    private By createUserNameField = By.id("user");
    private By createEmailField = By.id("email");
    private By createPasswordField = By.id("password");
    private By createUserButton = By.id("btnRegister");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerScreenAccess(){
        driver.get("https://automationpratice.com.br/register");
    }


    public void fillEmailCreate(){
        waitElementBePresent(createEmailField,300);
        driver.findElement(createUserNameField).sendKeys("Souza");
        driver.findElement(createEmailField).sendKeys(getRandomEmail());
        driver.findElement(createPasswordField).sendKeys("12345678");
    }

    public void clickCreateUserButton() throws InterruptedException {
        Thread.sleep(800);
        driver.findElement(createUserButton).click();
    }

}
