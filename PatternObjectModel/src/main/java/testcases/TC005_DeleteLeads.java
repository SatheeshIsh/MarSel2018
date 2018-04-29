package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="DeleteLeads";
		testDescription="Leads Delete";
		testNodes="Leads";
		category="Smoke";
		authors="Satheesh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteLeads(String uName,String pwd,String phone, String display)  {
		
		
		FindLead flp = new LoginPage()
         .enterUserName(uName)
         .enterPassword(pwd)
         .clickLogIn()
         .crmsfa()
         .leadsLink()
         .findLead()
         .phoneClick()
         .phonenumber(phone)
         .findLeadButton();
         String leadid = flp.firstLeadid();
         flp.leadidLink()
         .deletebutton()
         .findLead()
         .leadidSear(leadid)
         .findLeadButton()
         .textDisplay(display);
       
				
	}

}
