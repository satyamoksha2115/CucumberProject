package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue="Snippers",dryRun=false,
tags=("@smoke"),
plugin= {"rerun:target/failedtest.txt"}
)
public class DryRun {

}
