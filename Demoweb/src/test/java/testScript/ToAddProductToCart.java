package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.CheckOut;
import PomScript.DigitalDownloadsPage;
import PomScript.LoginPage;
import PomScript.WelcomePage;


public class ToAddProductToCart extends BaseClass {
	@Test
	public void toOpendigital() {
	   DigitalDownloadsPage d= new DigitalDownloadsPage(driver);
		d.getAlbumonelink().click();

}
	@Test(dataProvider="credentials")
		public void toLogin(String name, String Pass) {
		WelcomePage w= new WelcomePage(driver);
		w.getLoginlink().click();
		Reporter.log("registered suceesfully",true);
		LoginPage lp = new LoginPage(driver);
		lp.getEmailtextfield().sendKeys(name);
		lp.getPasswordtextfield().sendKeys(Pass);
		lp.getLoginbutton().click();
		
	}
		@DataProvider(name="credentials")
		public Object[][] fetching() throws EncryptedDocumentException, IOException{
			return ReadExcelUtility.fetchdata("Sheet1");
			
			
		}
		@Test(dataProvider ="credentials1")
		public void toCheckoutpage(String name,String name2,String mail,String country,String province,String city,String ad1,String ad2,String phone,String fax) {
			 CheckOut c= new CheckOut(driver);
			 c.getFirsttext().clear();
			 c.getFirsttext().sendKeys(name);
			 c.getLastname().clear();
			 c.getLastname().sendKeys(name2);
			 c.getEmailtext().sendKeys(mail);
			// c.getCompanytext().sendKeys(null);
			 Select s= new  Select(c.getCountryDropdown());
			 s.selectByVisibleText(country);
			 Select s1= new  Select(c.getProvincedropdown());
			 s1.selectByVisibleText(province);
			 c.getCitytext().sendKeys(city);
			 c.getAddressonetext().sendKeys(ad1);
			 c.getAddresstwotext().sendKeys(ad2);
			 c.getPhonenumbertext().sendKeys(phone);
			 c.getFaxnumbertext().sendKeys(fax);
			 c.getContinuebutton().click();
			 driver.quit();
			 
		}
		@DataProvider(name="credentials1")
		public Object[][] fetch() throws EncryptedDocumentException, IOException{
			return ReadExcelUtility.fetchdata("Sheet3");
			
			
		}
		
}
	
