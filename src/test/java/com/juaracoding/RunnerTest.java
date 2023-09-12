package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/Fitur1_Login.feature",
                "src/main/resources/features/Fitur2_AbsenMasuk.feature",
                "src/main/resources/features/Fitur3_AbsenPulang.feature",
                "src/main/resources/features/Fitur4_AbsenSakit.feature",
                "src/main/resources/features/Fitur5_AbsenIzin.feature",
        },

        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
