package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public abstract class BasePage {

		public WebDriver driver;
		public BasePage(WebDriver driver) //BasePage is parameterized
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
			// driver is blue is global and the driver is brown is local variable.
		
		}

// if there is a new pom class written, all of the class should extend this basepage
		
		public void VerifyTitle()
		{
			Assert.assertEquals(atitle, etitle);
		}
}
