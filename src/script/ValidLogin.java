package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1)
	public void testValidLogin()
	{
		String loginPageTitle=Excel.getData(XL_PATH, "ValidLogin", 1, 0);
		String un=Excel.getData(XL_PATH, "ValidLogin", 1, 1);
		String pw=Excel.getData(XL_PATH, "ValidLogin", 1, 2);
		String HomePageTitle=Excel.getData(XL_PATH, "ValidLogin", 1, 3);
		
		LoginPage l= new LoginPage(driver);
		l.verifyIsPageDisplayed(driver, loginPageTitle);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		l.verifyIsPageDisplayed(driver, HomePageTitle);
	}

}
