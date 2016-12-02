package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst {

	// since this class is not a executable class(as no @Test method) it 
	// is considered as incomplete. to indicate that it is an Incomplete class
	// we use the keyword as abstract. 
	
	public WebDriver driver;
	String key = "webdriver.chrome.driver";
	String value = "C:/Users/Kamal/workspace/Automation/Source/chromedriver.exe";
	
	
	@BeforeMethod
	public void precondition()
	{
		driver = new ChromeDriver();
		driver.get("http://localhost");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	
}
