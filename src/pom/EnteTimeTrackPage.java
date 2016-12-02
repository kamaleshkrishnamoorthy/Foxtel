package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnteTimeTrackPage extends BasePage{

	@FindBy(id = "logout Link")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(linkText = "About actiTime")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[@class='product version']")
	private WebElement productVersion;
	
	@FindBy(xpath="//img[@title='close']")
	private WebElement closeButton;
	
		
	public EnteTimeTrackPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickLogoutLink()
	{
		logoutLink.click();
	}
	
	public void ClickHelp()
	{
		help.click();
	}

	public void ClickAboutActiTIME()
	{
		aboutActiTIME.click();
	}
	
	public void VerifyProductVersion(String eversion)
	{
		String aversion = productVersion.getText();
		Assert.assertEquals(aversion, eversion);
		
	}
		
	public void clickcloseButton()
	{
		closeButton.click();
	}
	
	
	
	
}
