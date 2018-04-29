package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="DuplicateLeads";
		testDescription="Leads Duplicate";
		testNodes="Leads";
		category="Smoke";
		authors="Satheesh";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLeads(String uName,String pwd,String email)  {
		
		
		FindLead flp = new LoginPage()
         .enterUserName(uName)
         .enterPassword(pwd)
         .clickLogIn()
         .crmsfa()
         .leadsLink()
         .findLead()
         .emailLink()
         .emailField(email)
         .findLeadButton();
         String fNameValue = flp.fNameValue();
         flp.fnameClick()
         .duplicateLeadBut()
         .dupCreateLeadButton()
         .viewlead(fNameValue);
       
				
	}

}
