package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLeads";
		testDescription="Leads Edit";
		testNodes="Leads";
		category="Smoke";
		authors="Satheesh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editLeads(String uName,String pwd,String firstname, String compname,String updname)  {
		
         new LoginPage()
         .enterUserName(uName)
         .enterPassword(pwd)
         .clickLogIn()
         .crmsfa()
         .leadsLink()
         .findLead()
         .findLeadsSear(firstname)
         .findLeadButton()
         .leadidLink()
         .editButton()
         .editCompName(compname)
         .updButton()
         .verifyCompanyName(updname);
				
	}

}
