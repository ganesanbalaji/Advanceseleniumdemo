package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.LoginPage;
import PomScript.WelcomePage;

public class ToLogin extends BaseClass {
	@Test(dataProvider = "credentials")
	public void toTestLogin(String name,String pass) {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmailtextfield().sendKeys(name);
		lp.getPasswordtextfield().sendKeys(pass);
		lp.getLoginbutton().click();
	}
	@DataProvider(name="credentials")
	public Object[][] fetching() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchdata("Sheet1");
		
		
	}

}
