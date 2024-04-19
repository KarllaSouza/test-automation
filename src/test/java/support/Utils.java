package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
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


}
