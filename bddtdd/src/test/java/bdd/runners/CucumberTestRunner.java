package bdd.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "bdd.stepdefinitions",
    plugin = {
        "pretty"
    },
    monochrome = true
)
public class CucumberTestRunner {
    // Esta clase está vacía, solo actúa como punto de entrada para Cucumber
}
