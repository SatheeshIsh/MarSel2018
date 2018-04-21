package wdMethods;


import org.junit.Test;

public class EditContact extends LoginApp {
	
	@Test
	public void editContact() throws InterruptedException
	{
		leadslogin();
        click(locateElement("Xpath", "//a[text()='Contacts']"));
        click(locateElement("Xpath", "//a[text()='Find Contacts']"));
        type(locateElement("Xpath", "(//input[@name='firstName'])[3]"), "Satheesh");
        click(locateElement("Xpath", "//button[text()='Find Contacts']"));
        Thread.sleep(3000);
        click(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div)[1]/a"));
        String title = driver.getTitle();
        verifyTitle(title);
        click(locateElement("Xpath", "//a[text()='Edit']"));
        driver.findElementByXPath("//input[@id='updateContactForm_firstName']").clear();
        String name = "Sri";
        type(locateElement("Xpath", "//input[@id='updateContactForm_firstName']"), name);
        click(locateElement("Xpath", "(//input[@name='submitButton'])[1]"));
        verifyPartialText(locateElement("Xpath", "//span[@id='viewContact_fullName_sp']"), name);
        closeBrowser();
        
	}

}
