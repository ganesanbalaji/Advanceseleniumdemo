package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebDriverUtility {
	
	@BeforeSuite
	public void beforeSuite() {
	Reporter.log("connection to the database",true);
	}

	@BeforeTest
	public void beforeTest() {
	Reporter.log("connection to the server",true);
	}
	@BeforeClass
	public void beforeclass() throws IOException {
	Reporter.log("Browser got launched successfully",true);
	driver = new ChromeDriver();
	maximize();
	implicitwait();
	Reporter.log("Browser got maximized successfully",true);
	String url = propertyfileUtility.PropertyData("url");
	getUrl(url);
	
	
	
}
@BeforeMethod
public void toLogin() {
	//driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.linkText("Log in")).click();
	Reporter.log("navigated to login page");
} 
	
@AfterMethod
public void toLogout() {
	//driver.findElement(By.linkText("Log out")).click();
	Reporter.log("Browser got successfully logged out",true);
}
@AfterClass
public void toCloseBrowser() {
	Reporter.log("Browser got closed successfully",true);
	driver.quit();
}

	@AfterTest
	public void toClosebrowser(){
		Reporter.log("Browser got closed successfully",true);
	}
	@AfterSuite
	
	public void toCloseserver(){
		Reporter.log("server got closed successfully",true);
	}
	
	
	
}







