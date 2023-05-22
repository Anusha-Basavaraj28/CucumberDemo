package com.demo.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//anush//eclipse-workspace//CucumberDemo//HooksDEmo//hooksDemo.feature",
                glue = "com.demo.StepsForHooks",
                plugin = {"pretty","html:target/htmlReport"})
public class TestRunnerForHooks {

}
