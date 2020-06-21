package com.main;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="com.step", plugin= {"json:target/cucumber.json"})
public class TestRunner {

	
	
	
}
