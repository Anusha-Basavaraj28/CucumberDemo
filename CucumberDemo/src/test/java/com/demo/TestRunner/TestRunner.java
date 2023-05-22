package com.demo.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//anush//eclipse-workspace//CucumberDemo//Features//lodinDDTExcelDemo.feature",
                   glue = "com.demo.StepDefinitions",
                   monochrome = true,
                   plugin = {"pretty","html:target/htmlreport",
                		   "json:target/jsonReport",
                		   "junit:target/junitReport"})
                   
public class TestRunner {

}
