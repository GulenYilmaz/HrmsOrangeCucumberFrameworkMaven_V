package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends CommonMethods{

	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario -->"+scenario.getName());
		setUp();
		initializeAllPages();
	}
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenario -->"+scenario.getName());
//		if(scenario.isFailed()) {
//			System.out.println("Test FAIL -->"+ scenario.getName());
//			byte[] picture=takeScreenShot("/failed/"+scenario.getName());
//			scenario.embed(picture, "image/png");
//		}else {
//			System.out.println("Test PASS -->"+ scenario.getName());
//			byte[] picture=takeScreenShot("/passed/"+scenario.getName());
//			scenario.embed(picture, "image/png");
//		}
		tearDown();
	}
}