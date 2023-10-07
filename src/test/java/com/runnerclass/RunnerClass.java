package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",glue="Snippers",
plugin= {"pretty","html:target/HTMLREPORTS/report.html"})
public class RunnerClass {

}
