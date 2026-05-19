package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Balaji\\eclipse-workspace\\Cucumber_DemoA\\src\\test\\java\\com\\feature", glue = "com.stepdefinition" , dryRun = false)

public class RunnerDemo {
	
	
	


}
