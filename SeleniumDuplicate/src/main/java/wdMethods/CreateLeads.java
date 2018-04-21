package wdMethods;



import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import wdMethods.MyRetryAnalyzer;

public class CreateLeads extends LoginApp {
	int i=0;
	@Test(groups="smoke")
	public void Createlead() {
		
		/*startApp("chrome","http://www.leaftaps.com/opentaps");
		WebElement user=locateElement("id","username");
		WebElement pass=locateElement("id","password");
		type(locateElement("id","username"),"DemoSalesmanager");
		type(locateElement("id","password"),"crmsfa");
		WebElement submit=locateElement("class","decorativeSubmit");
		click(submit);
		WebElement CRMlink = locateElement("linktext","CRM/SFA");
		click(CRMlink);*/
		//leadslogin();
		WebElement createlead = locateElement("linktext","Create Lead");
		click(createlead);
		type(locateElement("id","createLeadForm_companyName"),"Satheesh pvt ltd");
		type(locateElement("id","createLeadForm_firstName")	,"Satish");
		type(locateElement("id","createLeadForm_lastName")	,"Ish");
		selectDropDownUsingText(locateElement("id","createLeadForm_dataSourceId"),"Employee");
		selectDropDownUsingIndex(locateElement("id","createLeadForm_marketingCampaignId"),2);
		click(locateElement("name","submitButton"));
	    //closeapp();
	}

}
