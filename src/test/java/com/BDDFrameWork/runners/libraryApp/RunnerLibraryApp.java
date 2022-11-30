package com.BDDFrameWork.runners.libraryApp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features/libraryApp",
        glue = "com/BDDFrameWork/stepDef/libraryApp",
        dryRun = true,
        tags = "@us7Library"

)

public class RunnerLibraryApp {

}
