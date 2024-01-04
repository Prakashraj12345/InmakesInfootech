package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before(order=1)
	private void precondidtion2() {
		launchBrowser();
	

	}
	@Before(order = 2)
	private void precondidtion1() {
           windowMaximize();
	

	}
	@Before
	private void precondidtion3() {
        System.out.println("Launch the browser");
        
	}
	
	
	
	
	@After
	private void postcondition2() {
		System.out.println("Close the Browser");

	}
	@After
	private void postcondition1() {
	closeEntireBrowser();	
	}


}
