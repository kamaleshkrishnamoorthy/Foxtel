package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

	@FindBy(id = "username")
	private WebElement unTextBox;
	// the above is a varaible untext of type webelement. only decalred
	//will be initialized during runtime only.
	
	@FindBy(name = "pwd")
	private WebElement pwTextBox;
	
	@FindBy(id = "LoginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "/span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void SetUserName(String un)
	{
		unTextBox.sendKeys(un);
	}
	
	public void SetPassword(String pw)
	{
		pwTextBox.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public void verifyErrMsgDisplayed()
	{
		Assert.assertTrue(errmsg.isDisplayed());
	}
	
}
