package com.demo.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//anush//eclipse-workspace//CucumberDemo//BackgroundDemo//backgroundDemo.feature",
                   glue = "StepsForBackground",
                   monochrome = true,
                   plugin = {"pretty","html:target/htmlReport"})
                  
                 
public class TestRunnerForBackGroundDemo {

}
