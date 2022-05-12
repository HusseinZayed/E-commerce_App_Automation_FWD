package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "step_definition",
        tags = "@Major_Functions"
)
@RunWith(Cucumber.class)
public class Runner  {
}
