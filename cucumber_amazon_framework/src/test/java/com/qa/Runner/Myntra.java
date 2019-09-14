package com.qa.Runner;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



import org.apache.commons.mail.EmailException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="E://cucumber_amazon_framework//src//test//java//com//qa//features",
glue={"stepDefinitions"},
/*plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Amazon_Report.html:json:target/cucumber.json"},*/
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/myntra_Report.html","json:target/cucumber.json"},
tags={"@HomeTest"},

dryRun=false)


public class Myntra extends AbstractTestNGCucumberTests{
	
	/*@AfterClass()
	public static void report() throws IOException, EmailException
	{
		File file=new File(System.getProperty("user.dir")+"//src//main//java//com//qa//config//extent-config.xml");
		//FileReader reader=new FileReader(file);
		//File file=new File(System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
		Properties pro=new Properties();

		com.cucumber.listener.Reporter.loadXMLConfig(file);
		
		System.out.println("Generating report");
		//Send_email.send_email();
	
		
	}*/
	 
}
/*public class myntra {

	@AfterClass()
	public static void report() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
		//FileReader reader=new FileReader(file);
		//File file=new File(System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
		Properties pro=new Properties();

		com.cucumber.listener.Reporter.loadXMLConfig(file);
	}
}*/

