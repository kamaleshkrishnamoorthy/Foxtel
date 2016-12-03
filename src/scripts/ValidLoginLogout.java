package scripts;

import generics.Excel;

import org.testng.annotations.Test;

import pom.EnteTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest {

	@Test
	public void testValidLoginLogout()
	{
		String un = Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 0);
		String pw = Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 1);
		String hp = Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 2);
		String lp = Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1, 3);
		
	
	//Enter Valid Login
	LoginPage l = new LoginPage(driver);
	l.SetUserName(un);
		
	//Enter Valid Password
	l.SetPassword(pw);
	
	//Click Login
	l.clickLogin();
		
	//Verify home Page
	
	EnteTimeTrackPage e = new EnteTimeTrackPage(driver);
	e.VerifyTitle(hp);
	//Click Logout
	
	e.ClickLogoutLink();
	
	//Verify Login page
	e.VerifyTitle(lp);
	
	}

}
