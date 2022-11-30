package com.BDDFrameWork.runners.tryCloud;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features/tryCloud",
        glue = "com/BDDFrameWork/stepDef/tryCloud",
        dryRun = false,
        tags = "@run"

)

public class RunnerTryCloud {

}
