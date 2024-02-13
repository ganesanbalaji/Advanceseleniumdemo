package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.ReadExcelUtility;

public class Sample1Test {

	
	@Test(dataProvider = "credential ")
	public void testCase(String username,String password) {
		
		Reporter.log(username,true);
		Reporter.log(password,true);
	}
	
	@DataProvider(name = "credential")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		
		return ReadExcelUtility.fetchdata("Sheet1");
	}
}
