package wdMethods;

import org.junit.Test;

public class DeactivateContact extends LoginApp {

	@Test
	public void deacctivateContact() throws InterruptedException {

		leadslogin();
		click(locateElement("Xpath", "//a[text()='Contacts']"));
		click(locateElement("Xpath", "//a[text()='Find Contacts']"));
		type(locateElement("Xpath", "(//input[@name='firstName'])[3]"), "Satheesh");
		click(locateElement("Xpath", "//button[text()='Find Contacts']"));
		Thread.sleep(3000);
		click(locateElement("Xpath","(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div)[1]/a"));
		String title = driver.getTitle();
		clickNoSnap(locateElement("Xpath", "//a[text()='Deactivate Contact']"));
		acceptAlert();
		verifyPartialText(locateElement("Xpath", "//span[@class='subSectionWarning']"), "This contact was deactivated as of 3/30/18 05:51:53");
		click(locateElement("Xpath", "//a[text()='Find Contacts']"));
		type(locateElement("Xpath", "(//label[text()='Contact Id:']/following::div/input)[1]"), "10420");
		click(locateElement("Xpath", "//button[text()='Find Contacts']"));
        Thread.sleep(3000);
    	verifyExactText(locateElement("Xpath", "//div[@class='x-paging-info']"), "No records to display");
		closeapp();
	}

}
