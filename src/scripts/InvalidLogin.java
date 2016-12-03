package scripts;

import generics.Excel;

import org.testng.annotations.Test;

import pom.LoginPage;

public class InvalidLogin extends BaseTest{

	
	@Test
	public void testInvalidLogin()
	{
		int rc = Excel.getRowCount(XL_PATH, "InvalidLogin");
		for(int i= 1; i<=rc; i++)
		{
			String un = Excel.getCellValue(XL_PATH, "InvalidLogin", i, 0);
			String pw = Excel.getCellValue(XL_PATH, "InvalidLogin", i, 1);
			
			// Enter UserName
			LoginPage l = new LoginPage(driver);
			l.SetUserName(un);
			
			// Enter Password
			l.SetPassword(pw);
			
			// click login
			l.clickLogin();
			
			// Verify Error Message
			l.verifyErrMsgDisplayed();
			
		}
	}
}
