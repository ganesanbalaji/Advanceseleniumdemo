package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.LoginPage;
import PomScript.WelcomePage;

public class LoginTest extends BaseClass {
	@Test
	public void toLoginTest() {
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmailtextfield().sendKeys(username);
		lp.getPasswordtextfield().sendKeys(password);
		lp.getLoginbutton().click();
		
	}


}
