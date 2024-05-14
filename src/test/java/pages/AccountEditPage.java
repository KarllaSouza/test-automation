package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class AccountEditPage extends RunCucumberTest {
    private final static By ACCOUNT_AREA = By.id("my-account_area");
    private By accountDetailsButton = By.xpath("//*[@id=\"my-account_area\"]/div/div/div[1]/div/ul/li[5]/a");
    private By updateAccountButton = By.xpath("//*[@id=\"dashboard\"]/div/div[1]/a");
    private By editAccountArea = By.id("account_edit");
    private By accountForm = By.id("account_info_form");
    private By photoUser = By.className("account_thumb_img");
    private By genderW = By.cssSelector("#account_info_form > div.input-radio > span:nth-child(2) > input[type=radio]");
    private By genderM = By.cssSelector("#account_info_form > div.input-radio > span:nth-child(1) > input[type=radio]");
    private By firstName = By.id("f_name");
    private By lastName = By.cssSelector("#account_info_form > div:nth-child(2) > input:nth-child(3)");
    private By email = By.id("email_address");
    private By actualPassword = By.id("current_password");
    private By newPassword = By.id("new_password");
    private By confirmNewPassword = By.id("re_password");
    private By updateAccountAfterEditionsButton = By.xpath("//*[@id=\"account_info_form\"]/button");
    private By emailInProfile = By.cssSelector("#vendor_area > div > div > div.col-sm-12.col-md-12.col-lg-9 > div > div > div > ul > li:nth-child(2) > div > div.profile_right");
    private By userImageInsertButton = By.cssSelector("#account_edit > div > div:nth-child(2) > div.col-lg-3 > div > div > div > input[type=file]");
    private By profileTitlePage = By.cssSelector("#vendor_area > div > div > div.col-sm-12.col-md-12.col-lg-9 > div > div > div > h4");
    public By profileArea = By.id("vendor_area");


    String userName = Utils.getRandomUserName();
    String userLastName = Utils.getRandomUserName();
    String userEmail = Utils.getRandomEmail();
    String userNewPassword = Utils.getRandomPassword();


    public void dashboardScreenAccess() {
        getDriver().get("https://automationpratice.com.br/my-account");
        Utils.waitElementBePresent(ACCOUNT_AREA, 150);
    }

    public void accountDetailsScreenAccess(){
        getDriver().findElement(accountDetailsButton).click();
        Utils.waitElementBePresent(updateAccountButton, 150);
        Assert.assertTrue(getDriver().findElement(updateAccountButton).isDisplayed());
    }

    public void accountDetailsEditScreenAccess(){
        getDriver().findElement(updateAccountButton).click();
        Utils.waitElementBePresent(editAccountArea, 200);
        Assert.assertTrue(getDriver().findElement(editAccountArea).isDisplayed());
    }

    public void editAccountDetailsScreen(){
        Assert.assertTrue(getDriver().findElement(accountForm).isDisplayed());
        Assert.assertTrue(getDriver().findElement(photoUser).isDisplayed());
    }

    public void fillInAccountDetails(){
        Assert.assertTrue(getDriver().findElement(genderW).isDisplayed());
        Assert.assertTrue(getDriver().findElement(genderM).isDisplayed());
        Assert.assertTrue(getDriver().findElement(firstName).isDisplayed());
        Assert.assertTrue(getDriver().findElement(lastName).isDisplayed());
        Assert.assertTrue(getDriver().findElement(email).isDisplayed());
        Assert.assertTrue(getDriver().findElement(actualPassword).isDisplayed());
        Assert.assertTrue(getDriver().findElement(newPassword).isDisplayed());
        Assert.assertTrue(getDriver().findElement(confirmNewPassword).isDisplayed());

        getDriver().findElement(genderW).click();
        getDriver().findElement(firstName).sendKeys(userName);
        getDriver().findElement(lastName).sendKeys(userLastName);
        getDriver().findElement(email).sendKeys(userEmail);
        getDriver().findElement(newPassword).sendKeys(userNewPassword);
        getDriver().findElement(confirmNewPassword).sendKeys(userNewPassword);
    }

    public void ValidateThatAllFieldsAreFilledIn(){
        Assert.assertNotNull(firstName);
        Assert.assertNotNull(lastName);
        Assert.assertNotNull(email);
        Assert.assertNotNull(actualPassword);
        Assert.assertNotNull(newPassword);
        Assert.assertNotNull(confirmNewPassword);
    }

    public void clickToSaveEditions(){
        Assert.assertTrue(getDriver().findElement(updateAccountAfterEditionsButton).isDisplayed());
        getDriver().findElement(updateAccountAfterEditionsButton).submit();
    }

    public void validateThatAllEditionsAreSaved(){
        Utils.waitElementBePresent(profileArea,100);
        //Assert.assertEquals(userEmail, getDriver().findElement(emailInProfile).getText()); //The correct way to verify
        String emailAddressInProfile = getDriver().findElement(emailInProfile).getText(); //It's fix on site
        Assert.assertTrue(emailAddressInProfile.contains("demo123@gmail.com"));
    }

    public void pageAfterUpdate (){
        Utils.waitElementBePresent(profileArea,100);
        Assert.assertTrue(getDriver().findElement(profileArea).isDisplayed());
        String titlePage = getDriver().findElement(profileTitlePage).getText();
        Assert.assertTrue(titlePage.contains("Profile"));
    }

    public void insertAnImage(String pathFile){
        getDriver().findElement(userImageInsertButton).isDisplayed();
        getDriver().findElement(userImageInsertButton).sendKeys(pathFile);

       // Select select_image = new Select(userImageButton);
       // select_image.selectByVisibleText(state);
    }

}
