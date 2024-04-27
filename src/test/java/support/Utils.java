package support;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public void waitElementBePresent(By element, Integer time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail(){
        String emailInit = "projectautomation_";
        String emailFinal = "@souza.com.br";

        Random random = new Random();
        int low = 1;
        int high = 10000;
        int result = random.nextInt(high-low) + low;

        return emailInit + result + emailFinal;
    }

    public String getRandomPassword() {
        String password = RandomStringUtils.random(8, true, true);
        return password;
    }


}
