package com.juaracoding.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/File1_Login.feature",
                "src/main/resources/features/File2_AbsenMasuk.feature",
                "src/main/resources/features/File3_AbsenPulang.feature",
                "src/main/resources/features/File4_AbsenIzin.feature",
                "src/main/resources/features/File5_AbsenSakit.feature",
                "src/main/resources/features/File6_AbsenOff.feature",
                "src/main/resources/features/File7_AbsenValid.feature",
                "src/main/resources/features/File8_AbsenAfterValidAbsen.feature",

        },
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}