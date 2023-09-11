package com.juaracoding;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/file1_Login.feature",
                    "src/main/resources/features/file2_MasterParameterShifting.feature",
                    "src/main/resources/features/file3_MasterUnitKerjaPenempatan.feature",
                    "src/main/resources/features/file4_MasterPosition.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
