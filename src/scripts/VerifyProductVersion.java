package scripts;

import generics.Excel;

import org.testng.annotations.Test;

import pom.EnteTimeTrackPage;
import pom.LoginPage;

public class VerifyProductVersion extends BaseTest {

	@Test
	public void testVerifyProductVersion()
	{
		String sheet="VerifyProductVersion";
		String un=Excel.getCellValue(XL_PATH,sheet,1,0);
		String pw=Excel.getCellValue(XL_PATH,sheet,1,1);
		String version=Excel.getCellValue(XL_PATH,sheet,1,2);
			//enter valid un
			LoginPage l=new LoginPage(driver);
			l.SetUserName(un);
			//enter valid pwd
			l.SetPassword(pw);
			//click login
			l.clickLogin();
			//click help
			EnteTimeTrackPage e=new EnteTimeTrackPage(driver);
			e.ClickHelp();
			//click about
			e.ClickAboutActiTIME();
			//verify the product version is actiTIME 2016.1
			e.VerifyProductVersion(version);
			//click close button
			e.clickcloseButton();
			//click logout
			e.ClickLogoutLink();
	     }	
	}
