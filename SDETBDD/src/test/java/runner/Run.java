package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Jnuit
// Runwith is used to run the test suite;
//feature-if we have more than 1 feature file then we need to add the feature file which need to run
//glue-where is the script is going to available-- we need to give only the package name no need to add the class name
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepdefinition",plugin="html:C:\\Users\\prave\\eclipse-workspace\\SDETBDD\\Reports\\r1.html")

public class Run {

  
}
