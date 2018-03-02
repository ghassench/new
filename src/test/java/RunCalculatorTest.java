

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = { "pretty", "html:target/cucumber" },
        glue = "CalculatorSteps"
       
)
public class RunCalculatorTest {
    
}