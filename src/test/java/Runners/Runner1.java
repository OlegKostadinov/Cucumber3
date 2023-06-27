package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Function_Check.feature",
        glue = {"SteppDefinitions"}
)

public class Runner1 extends AbstractTestNGCucumberTests {

}
