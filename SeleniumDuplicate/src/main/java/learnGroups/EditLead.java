package learnGroups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.LoginApp;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EditLead extends LoginApp {
	
	@Test(groups="smoke")
	public void edit()
	{
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
        WebElement Leads= locateElement("linktext","Leads")	;	
        click(Leads);
        click(locateElement("linktext", "Find Leads"));
        type(locateElement("Xpath","//label[text()='Lead ID:']/following::input[2]"),"Satish");
        click(locateElement("Xpath", "//button[text()='Find Leads']"));  
        
        WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a")));
		
		click(locateElement("Xpath","(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a"));
		verifyTitle("View Lead");
		click(locateElement("linktext", "Edit"));
		WebElement clear = locateElement("id", "updateLeadForm_companyName");
		clear.clear();
		type(locateElement("id", "updateLeadForm_companyName"),"Satupdate");
		click(locateElement("name", "submitButton"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"),"Satupdate");
		//closeapp();
		
	}

}
