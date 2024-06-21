package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\feature\\Assess.feature",glue="org.snippets",monochrome=true,publish=true)


public class AssessmentRunner {

}
