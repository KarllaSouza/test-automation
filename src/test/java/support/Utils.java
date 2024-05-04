package support;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void waitElementBePresent(By element, Integer time){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail(){
        String emailInit = "projectautomation_";
        String emailFinal = "@souza.com.br";

        Random random = new Random();
        int low = 1;
        int high = 10000;
        int result = random.nextInt(high-low) + low;

        return emailInit + result + emailFinal;
    }

    public static String getRandomPassword() {
        String password = RandomStringUtils.random(8, true, true);
        return password;
    }

    public static String getRandomUserName() {
        String userName = RandomStringUtils.randomAlphabetic(3, 10);
        return userName;
    }


}
