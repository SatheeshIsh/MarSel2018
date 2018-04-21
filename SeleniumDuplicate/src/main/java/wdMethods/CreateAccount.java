package wdMethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CreateAccount extends LoginApp {

	@Test
	public void createAccount() {

		leadslogin();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Create Account']"));
		String name = "Adrkumar";
		type(locateElement("Xpath", "//input[@id='accountName']"), name);
		selectDropDownUsingIndex(locateElement("Xpath", "//select[@name='industryEnumId']"), 1);
		selectDropDownUsingIndex(locateElement("Xpath", "//select[@id='currencyUomId']"), 2);
		selectDropDownUsingIndex(locateElement("Xpath", "//select[@id='dataSourceId']"), 3);
		selectDropDownUsingIndex(locateElement("Xpath", "//select[@id='marketingCampaignId']"), 4);
		type(locateElement("Xpath", "//input[@id='primaryPhoneNumber']"), "9003500731");
		type(locateElement("Xpath", "//input[@id='generalCity']"), "Atlanta");
		type(locateElement("Xpath", "//input[@id='primaryEmail']"), "satheeshm@gmail.com");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='generalCountryGeoId']"), "India");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='generalStateProvinceGeoId']"), "TAMILNADU");
		click(locateElement("Xpath", "//input[@class='smallSubmit']"));
		/*
		 * WebElement accid = driver.findElementByXPath(
		 * "(//td[@class='titleCell'][1]/following::td/span)[1]"); String text
		 * =accid.getText();
		 */
		String text = getText(locateElement("Xpath", "(//td[@class='titleCell'][1]/following::td/span)[1]"));
		text = text.replaceAll(name, "");
		System.out.println(text);
		String substring = text.substring(2, 7);
		System.out.println(substring);
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//input[@name='id']"), substring);
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), name);
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("Xpath", "//td[@class='x-grid3-col x-grid3-cell x-grid3-td-groupName ']/div/a"),name);
		closeapp();

	}

}
