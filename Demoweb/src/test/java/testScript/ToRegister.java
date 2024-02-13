package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.RegisterPage;
import PomScript.WelcomePage;

public class ToRegister extends BaseClass {
	@Test(dataProvider = "credentials")
	public void toTest(String gender,String name,String name1,String email,String pass,String confirm) {
		WelcomePage w = new WelcomePage(driver);
		w. getRegisterlink().click();
		RegisterPage r = new RegisterPage(driver);
	    r.getGenderbutton().click();
	    r.getFirsttext().sendKeys(name);
	    r.getLastname().sendKeys(name1);
	    r.getEmailtext().sendKeys(email);
	    r.getPassword().sendKeys(pass);
	    r.getConfirmpassword().sendKeys(confirm);
		
	}
	@DataProvider(name="credentials")
	public Object[][] fetching() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchdata("Sheet2");
		
		
	}

} 
