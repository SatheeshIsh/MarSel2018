package wdMethods;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class MergeLead extends LoginApp {

@Test(timeOut=20000)
public void merge() throws InterruptedException
{
	/*startApp("chrome", "http://www.leaftaps.com/opentaps");
	WebElement user = locateElement("id", "username");
	WebElement pass = locateElement("id", "password");
	type(locateElement("id", "username"), "DemoSalesmanager");
	type(locateElement("id", "password"), "crmsfa");
	WebElement submit = locateElement("class", "decorativeSubmit");
	click(submit);
	WebElement CRMlink = locateElement("linktext", "CRM/SFA");
	click(CRMlink);*/
	leadslogin();
	WebElement Leads = locateElement("linktext", "Leads");
	click(Leads);
	click(locateElement("linktext", "Merge Leads"));
	click(locateElement("Xpath", "//input[@id='ComboBox_partyIdFrom']/following::a[1]"));
	switchToWindow(1);
	//Commented for TEstNG testing
	/*type(locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[1]"),"10463");
	click(locateElement("Xpath", "//button[text()='Find Leads']"));
	
	Thread.sleep(4000);
	clickNoSnap(locateElement("Xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	
	
    switchToWindow(0);
	clickNoSnap(locateElement("Xpath", "//input[@id='partyIdTo']/following::a[1]"));
	
	switchToWindow(1);
	
	type(locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[1]"),"10464");
    click(locateElement("Xpath", "//button[text()='Find Leads']"));
	Thread.sleep(4000);
	clickNoSnap(locateElement("Xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	
	switchToWindow(0);
	clickNoSnap(locateElement("Xpath", "//a[text()='Merge']"));
	acceptAlert();
	click(locateElement("Xpath", "//a[text()='Find Leads']"));
	type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[1]"),"10463");
    click(locateElement("Xpath", "//button[text()='Find Leads']"));
	Thread.sleep(4000);
	verifyExactText(locateElement("class", "x-paging-info"), "No records to display");*/
	//Commented for TEstNG testing
    closeapp();
	
	
}

}
