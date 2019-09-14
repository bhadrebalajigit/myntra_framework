package stepDefinitions;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.PageObjects.HomePage;
import com.qa.TestBase.TestContext;
import com.qa.utils.ExcelHandler;
import com.qa.utils.PropertiesFileReader;
import com.qa.utils.TestDataHandler;
import com.qa.utils.TestDataHandler_singleton;
import com.qa.utils.WebDriverManager_setup;

import cucumber.api.java.en.*;
public class HomePageSteps {
	
	PropertiesFileReader prop;
	public TestDataHandler testdata;
	TestContext testContext;
	HomePage homepage;
	public HomePageSteps(TestContext context) throws IOException
	{
		testContext = context;
		prop= new PropertiesFileReader();
		prop.getProperty(""+System.getProperty("user.dir")+"//src//main//java//com//qa//config//config.properties");
		//testdata=new TestDataHandler();
		homepage=testContext.getPageObjectManager().getHomePage();
		
		
	}
	WebDriverManager_setup driver_init;
	WebDriver driver;
	@Given("^User naviagate to Home Page$")
	public void user_naviagate_to_Home_Page() throws Throwable 
	{
		
		/*driver_init=new WebDriverManager_setup();
		//Map<String,String> testdata_mapping=testdata.getTestDataInMap();
		Map<String,String> testdata_mapping=TestDataHandler_singleton.getInstance().getTestDataInMap();
		driver=driver_init.getDriver(testdata_mapping.get("Browser"));
		
		
		driver.get(""+prop.getkey("url")+"");*/
		homepage.navigate_to_homepage();
		
		
	}
	@When("^user logged with valid credentials$")
	public void user_logged_with_valid_credentials() throws Throwable {
		homepage.customer_login();
	}
}
