package scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst {

	// since this class is not a executable class(as no @Test method) it 
	// is considered as incomplete. to indicate that it is an Incomplete class
	// we use the keyword as abstract. 
	

	public WebDriver driver;
	@Parameters({"remoteURL","browser"})
	@BeforeMethod
	public void precondition(String remoteURL, String browser) throws MalformedURLException
	{
		
		URL remoteAddress = new URL(remoteURL);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		System.setProperty(CD_KEY, CD_PATH);	
		driver = new RemoteWebDriver(remoteAddress, dc);
		driver.get("http://localhost");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	
}
