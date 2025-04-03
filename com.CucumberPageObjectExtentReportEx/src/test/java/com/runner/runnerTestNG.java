package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin= {"pretty",
        "html:target/cucumber-reports/Cucumber.html",
        "json:target/cucumber-reports/Cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
     features= "src/test/resources/com/features/LoginPage.feature",
     glue="com.definitions")

public class runnerTestNG extends AbstractTestNGCucumberTests{
 
}