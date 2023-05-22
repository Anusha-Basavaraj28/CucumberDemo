package com.demo.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//anush//eclipse-workspace//CucumberDemo//FeaturesWithTags//tags.feature",
                   glue = "com.demo.StepDefinitions",
                   tags = "@smoke and @regression"
                       )
                   
public class TestRunner_RunWithSingleTag {

}
