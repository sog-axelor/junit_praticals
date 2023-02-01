package com.unique.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.unique.main.testApp;

public class MainApp {
	public static void main(String[] args) {
		  Result result = JUnitCore.runClasses(testApp.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
}
