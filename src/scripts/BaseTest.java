package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst {

	// since this class is not a executable class(as no @Test method) it 
	// is considered as incomplete. to indicate that it is an Incomplete class
	// we use the keyword as abstract. 
	

	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(CD_KEY, CD_PATH);	
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
