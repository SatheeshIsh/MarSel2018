package wdMethods;

import java.io.ObjectInputStream.GetField;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CreateContacts extends LoginApp {
	
	@Test
	public void createContact ()
	{
		
		leadslogin();
		click(locateElement("Xpath", "//a[text()='Create Contact']"));
		type(locateElement("Xpath", "//input[@id='firstNameField']"), "Satheesh");
		type(locateElement("Xpath", "//input[@id='lastNameField']"), "Ish");
		type(locateElement("Xpath", "//input[@id='createContactForm_firstNameLocal']"), "Sattu");
		type(locateElement("Xpath", "//input[@id='createContactForm_lastNameLocal']"), "bhandu");
		type(locateElement("Xpath", "//input[@id='createContactForm_personalTitle']"), "officer");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalProfTitle']"), "Head");
		type(locateElement("Xpath", "//input[@id='createContactForm_departmentName']"), "Department of science");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='createContactForm_preferredCurrencyUomId']"), "AMD - Armenian Dram");
		type(locateElement("Xpath", "//textarea[@id='createContactForm_description']"), "SAmple automation");
		type(locateElement("Xpath", "//textarea[@id='createContactForm_importantNote']"), "SAmple automation note");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneAreaCode']"), "044");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneExtension']"), "65441");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryEmail']"), "satheeshm17@gmail.com");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneNumber']"), "9003500731");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneAskForName']"), "Suggu");
		String text = getText(locateElement("Xpath", "//input[@id='generalToNameField']"));   /////// Need to be verified
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAddress1']"), "13th Buddhar street");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalCity']"), "Chennai");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalPostalCode']"), "600063");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalPostalCodeExt']"), "0000");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAttnName']"), "Adrash");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAddress2']"), "2nd cross street");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='createContactForm_generalStateProvinceGeoId']"), "California");
		selectDropDownUsingText(locateElement("Xpath", " //select[@id='createContactForm_generalCountryGeoId']"), "United States");
		click(locateElement("Xpath", "//input[@name='submitButton']"));
		verifyPartialText(locateElement("Xpath", "//span[@id='viewContact_fullName_sp']"), text);
		click(locateElement("Xpath", "//a[text()='Edit']"));
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='addMarketingCampaignForm_marketingCampaignId']"), "eCommerce Site Internal Campaign");
		click(locateElement("Xpath", "(//input[@name='submitButton'])[2]"));
		String text2 = getText(locateElement("Xpath", "((//tr[@class='rowWhite'])//a)[1]"));
		click(locateElement("Xpath", "(//input[@name='submitButton'])[1]"));
		verifyPartialText(locateElement("Xpath", "//span[@id='viewContact_marketingCampaigns_sp']"), text2);  //// Need to be verified
		
	}

}
