package learnGroups;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.LoginApp;
import wdMethods.MyRetryAnalyzer;
import wdMethods.SeMethods;

public class Create3 extends LoginApp {

	@Test()
	public void Createlead() {

	/*	startApp("chrome", "http://www.leaftaps.com/opentaps");
		WebElement user = locateElement("id", "username");
		WebElement pass = locateElement("id", "password");
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement CRMlink = locateElement("linktext", "CRM/SFA");
		click(CRMlink);*/
		// leadslogin();
		WebElement createlead = locateElement("linktext", "Create Lead");
		click(createlead);
		type(locateElement("id", "createLeadForm_companyName"), "Testleaf pvt ltd");
		type(locateElement("id", "createLeadForm_firstName"), "Tst");
		type(locateElement("id", "createLeadForm_lastName"), "leaf");
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "Employee");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"), 2);
		click(locateElement("name", "submitButton"));
		// closeapp();
	}

}
