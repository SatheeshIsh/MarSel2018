package wdMethods;

import org.junit.Test;

public class EditAccount extends LoginApp {
	@Test
	public void editAccount() throws InterruptedException
	{
		
		leadslogin();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//input[@name='id']"), "10913");
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "Adrkumar");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(3000);
		click(locateElement("Xpath", "//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a"));
		click(locateElement("Xpath", "//a[text()='Edit']"));
		driver.findElementByXPath("//input[@id='accountName']").clear();
		String name ="Adrashupd";
		type(locateElement("Xpath", "//input[@id='accountName']"), name);
		click(locateElement("Xpath", "(//input[@class='smallSubmit'])[1]"));
		String text = getText(locateElement("Xpath", "(//span[@class='tabletext'])[3]"));
		text=text.substring(0, 9);
		verifyExactText(text, name);
		closeapp();
		
	}

}
