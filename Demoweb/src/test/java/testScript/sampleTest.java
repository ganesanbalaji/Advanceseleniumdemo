package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import GenericUtility.ReadExcelUtility;

public class sampleTest  {
	@Test(dataProvider = "credentials")
	public void testCase(String username,String password) {
	Reporter.log("sample test2 executed successfully");
	Reporter.log(username,true);
	Reporter.log(password,true);
	
}
	@DataProvider(name="credentials")
	public Object[][] fetching() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchdata("Sheet1");
		
		
	}
}
