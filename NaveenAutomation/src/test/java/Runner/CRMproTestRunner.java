package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles/CRMProCreateUser.feature"}, //Tells location of feature file
				glue= {"StepDefinition"}	//Tells where step definition file is located
				,plugin= {"pretty","html:target/reports/report.html","junit:target/reports/report1.xml"}	//To generate reports
				,dryRun=false	//Help to check mapping between steps of feature file and methods in step definition class
				,monochrome=true	//It will delete unreadable data from the console.
//				,strict=true	//It will check any step in step definition  class is  defined or not 
				)
public class CRMproTestRunner {

}
