package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class AccountEditPage extends RunCucumberTest {

    private By accountArea = By.id("my-account_area");
    private By accountDetailsButton = By.xpath("//*[@id=\"my-account_area\"]/div/div/div[1]/div/ul/li[5]/a");
    private By updateAccountButton = By.xpath("//*[@id=\"dashboard\"]/div/div[1]/a");
    private By editAccountArea = By.id("account_edit");
    private By accountForm = By.id("account_info_form");
    private By photoUser = By.className("account_thumb_img");

    public void dashboardScreenAccess() {
        getDriver().get("https://automationpratice.com.br/my-account");
        Utils.waitElementBePresent(accountArea, 150);
    }

    public void accountDetailsScreenAccess(){
        getDriver().findElement(accountDetailsButton).click();
        Utils.waitElementBePresent(updateAccountButton, 150);
        Assert.assertTrue(getDriver().findElement(updateAccountButton).isDisplayed());
    }

    public void accountDetailsEditScreenAccess(){
        getDriver().findElement(updateAccountButton).click();
        Utils.waitElementBePresent(editAccountArea, 150);
        Assert.assertTrue(getDriver().findElement(editAccountArea).isDisplayed());
    }

    public void editAccountDetailsScreen(){
        Assert.assertTrue(getDriver().findElement(accountForm).isDisplayed());
        Assert.assertTrue(getDriver().findElement(photoUser).isDisplayed());
    }






}
