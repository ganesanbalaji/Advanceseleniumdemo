package testScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleTest3 {
	@Test
	public void test() {
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\This Pc\\eclipse-workspace\\Demoweb\\ExtentReport\\report.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et= er.createTest("SampleTest3");
		et.log(Status.INFO,"test case successfuly attached to the report");
		er.flush();
	

}
}
