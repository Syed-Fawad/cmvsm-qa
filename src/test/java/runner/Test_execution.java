package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = {"src/test/resources/Features/Add_to_cart.feature","src/test/resources/Features/login.feature"},
       glue = {"StepsFiles"},
   // tags = "@Auth and @smoketest",
       plugin = {"pretty", "html:target/test-reports"}
       )


public class Test_execution {
	
}
