package learningReports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
	
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/reports.html");
		html.setAppendExisting(true);             
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("Testcase_001", "Create leads");
		test.pass("User name entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img10.png").build());
		test.fail("Login button not clicked");
		
		extent.flush();
		
	}
}


