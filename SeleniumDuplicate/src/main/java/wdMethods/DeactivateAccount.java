package wdMethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class DeactivateAccount extends LoginApp {
	
	@Test
	public void deactivate()
	{
		leadslogin();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//label[text()='Account ID:']/following::div/div/input"), "Sugavanesh S");
		type(locateElement("Xpath", "//label[text()='Account ID:']/following-sibling::div/input"), "11336");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		WebElement Accountid = locateElement("XPath", "//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a");
		click(locateElement("Xpath", "//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a"));
	    String title = driver.getTitle();
	    verifyTitle("Account Details | opentaps CRM");
	    clickNoSnap(locateElement("Xpath", "//a[@class='subMenuButtonDangerous']"));
	    getAlertText();
	    acceptAlert();
	    verifyPartialText(locateElement("Xpath", "//span[@class='subSectionWarning']"), "This account was deactivated as of");
	    click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//label[text()='Account ID:']/following::div/div/input"), "Sugavanesh S");
		type(locateElement("Xpath", "//label[text()='Account ID:']/following-sibling::div/input"), "11336");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("Xpath", "//div[@class='x-paging-info']"), "No records to display");
		closeapp();
	    
		
	}

}
