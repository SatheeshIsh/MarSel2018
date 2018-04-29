package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreatLeads";
		testDescription="Leads creation";
		testNodes="Leads";
		category="Smoke";
		authors="Satheesh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String compname,String firstname, String lastname)  {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.crmsfa()
		.leadsLink()
		.myleads()
		.enterCompanyname(compname)
		.enterFirstname(firstname)
		.enterLasttname(lastname)
		.createleadbutton()
		.viewlead(firstname);
				
	}

}
