package parameters;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.LoginApp;

public class Create5 extends LoginApp {

	@Test(dataProvider="sheet")
	public void Createlead(String Com,String first,String last,String data) {

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
		type(locateElement("id", "createLeadForm_companyName"), Com);
		type(locateElement("id", "createLeadForm_firstName"), first);
		type(locateElement("id", "createLeadForm_lastName"), last);
	    selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), data);
	//	selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"), camp);
		click(locateElement("name", "submitButton"));
		// closeapp();
	}
	
	@DataProvider(name="sheet")
	public Object[][] dataProvider() throws IOException
	{
	   /*Object[][] data= new Object[1][3];
	   data[0][0] = "Satheesh";
	   data[0][1] = "Sat";
	   data[0][2] = "ish";
	   
		return data;*/
		Excel testdata = new Excel();
		Object[][] excdata = testdata.readExcel();
		return excdata;
		
	}

}
