package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty","json:target/cucumber/cucumber.json","html:target/MyReports/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:target/MyReports"}, //reporting purpose
			monochrome=false,  //console output color
			tags = "@HomePage or @Register or @SignIn or @DataStructuresTS03  or @GraphFeature or @TreePage or @Array or @LinkedList",
				//	+ "@HomePage or @Register or @DataStructuresTS03 or @SignIn or @GraphFeature or @TreePage",
				//	+ "or @stackFeature or @queueFeature or @Array or @LinkedList", //tags from feature file
			features = {"src/test/resources/parallel"}, //location of feature files
			glue= {"parallel",},
			publish=true
			) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{

	    @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}
