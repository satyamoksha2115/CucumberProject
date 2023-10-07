package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedtest.txt",glue="Snippers",
plugin= {"rerun:target/failedtest.txt"})

public class Rerunner {

}
