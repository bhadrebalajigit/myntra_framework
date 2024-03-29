package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.qa.Helper.ScreenshotHelper;
import com.qa.TestBase.TestContext;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import javax.imageio.ImageIO;
public class Hooks {
	
	
	TestContext testContext;
	 
	 public Hooks(TestContext context) {
	 testContext = context;
	 }
	 
/*	 
 *  Do not delete below code
 * @After(order = 1)
	 public void afterScenario(Scenario scenario) {
	 if (scenario.isFailed()) {
		 Date date=new Date();
		 SimpleDateFormat simpledate=new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		 String current_date=simpledate.format(date);
		 String screenshotName = scenario.getName().replaceAll(" ", "_").concat(current_date);;
	 try {
		 File sourcePath = ((TakesScreenshot) testContext.getwebdrivermanager().driver).getScreenshotAs(OutputType.FILE);
		 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
		 Files.copy(sourcePath, destinationPath);   
		 Reporter.addScreenCaptureFromPath(destinationPath.toString());
		 
	 } catch (IOException e) {
	 } 
	 }
	 }*/
	 
	 @After(order = 1)
	 public void afterScenario(Scenario scenario) throws IOException {
	 if (scenario.isFailed()) {
		 Date date=new Date();
		 SimpleDateFormat simpledate=new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		 String current_date=simpledate.format(date);
		 String screenshotName = scenario.getName().replaceAll(" ", "_").concat(current_date);;
		 Reporter.addScreenCaptureFromPath(ScreenshotHelper.CaptureScreen(testContext.getwebdrivermanager().driver,screenshotName));
	 }
	 }
	 
	 
	 @After(order = 0)
		public void AfterSteps() {
		 testContext.getwebdrivermanager().driver.quit();
		}
	 
	 

}
