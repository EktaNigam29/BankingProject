package StepDefinition;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src\\test\\java\\FeatureFiles",
	glue= {"StepDefinition"},
	//tags="@test5",
	dryRun=false,//true will notexceute if steps are unimplemented
	monochrome=false,//true will not change color
	plugin= {"pretty", "html:target/HtmlReport/index.html", "json:target/CucumberReports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

	
		
		
		
)


public class TestRunner {

}
