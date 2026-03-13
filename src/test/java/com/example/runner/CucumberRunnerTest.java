package com.example.runner;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter( key = GLUE_PROPERTY_NAME, value ="com.example")
@ConfigurationParameter( key = Constants.FILTER_TAGS_PROPERTY_NAME, value ="@login")
@ConfigurationParameter( key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value ="false")
@ConfigurationParameter( key = Constants.PLUGIN_PROPERTY_NAME, value ="pretty , html:target/cucumber-report/cucumber.html")
@ConfigurationParameter( key = Constants.SNIPPET_TYPE_PROPERTY_NAME, value ="camelcase")

public class CucumberRunnerTest {
}
