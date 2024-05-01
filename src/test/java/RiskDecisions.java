import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
// Here we are binding feature files with Java clases
@CucumberOptions(features = {"src/test/resources/features"}, glue = {"stepsdefinitions"})
public class RiskDecisions {
}