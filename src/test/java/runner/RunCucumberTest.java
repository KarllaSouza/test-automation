package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        //plugin = {},
        features = "src/test/resources/features",
        tags = "@editar_dados",
        glue = {"steps"}
)

public class RunCucumberTest extends RunBase{

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
