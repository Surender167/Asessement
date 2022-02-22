package StepDefinitions;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/test/resources/Features/Facebooc.feature"},
glue = {"StepDefinitions"},
monochrome = true
//tags="@Login3"
)
public class Runner {



}