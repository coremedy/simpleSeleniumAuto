package com.sydneytesters.selenium.simpleSeleniumAuto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class launcher {

	public static void main(String[] args) throws ClassNotFoundException {
		// disable <scope>test</scope>
		XmlSuite suite = new XmlSuite();
		suite.setName("simpleSeleniumAuto");

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("url", "https://en.wikipedia.org/wiki/Main_Page");
		parameters.put("credential", "syd_tester");
		suite.setParameters(parameters);

		XmlTest test = new XmlTest(suite);
		test.setName("TestCase1");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		// output all classes to target/classes
		classes.add(new XmlClass("com.sydneytesters.selenium.simpleSeleniumAuto.test.threeSimpleOperations"));
		test.setXmlClasses(classes);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
	}

}