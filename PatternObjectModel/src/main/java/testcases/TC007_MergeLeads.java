package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="MergeLeads";
		testDescription="Leads Merge";
		testNodes="Leads";
		category="Smoke";
		authors="Satheesh";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void MergeLeads(String uName,String pwd,String leadid,String secleadid,String text)  {
		
		
		  new LoginPage()
         .enterUserName(uName)
         .enterPassword(pwd)
         .clickLogIn()
         .crmsfa()
         .leadsLink()
         .mergeLead()
         .firstIcon()
         .windowSwitch(1)
         .leadidfield(leadid)
         .findLeadsButton()
         .leadLinkClick()
         .windowSwitch(0)
         .secondIcon()
         .windowSwitch(1)
         .leadidfield(secleadid)
         .findLeadsButton()
         .leadLinkClick()
         .windowSwitch(0)
         .mergeButton()
         .alertClick()
         .findLeadbutton()
         .leadidSear(leadid)
         .findLeadButton()
         .textDisplay(text);

}
}
