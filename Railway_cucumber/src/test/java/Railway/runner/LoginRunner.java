package Railway.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/login.feature", glue = {"stepDefination"}
)
public class LoginRunner {
    LoginRunner login = new LoginRunner();
}
