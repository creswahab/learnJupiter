package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles", 
				 glue={"stepDefinitons", "hooks"}, 
				 dryRun=false,
				 monochrome=true,
				//format={"html:report/webreport", "json:report/jsonreport.json","junit:report/xmlreport.xml"},
				 //plugin={"html:reports/webreport", "json:reports/jsonreport.json","junit:reports/xmlreport.xml"}
				 tags={"@BackgroundLearn"}
				 )
public class runnerClass {

}
