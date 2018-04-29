package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods {
	
	private static final ViewLeads ViewLeads = null;
	public static String text;


	public  FindLead()
	{
		PageFactory.initElements(driver,this);
	}
	
	/////First name////
	@FindBy(how=How.XPATH, using="(//div[@class='x-form-item x-tab-item']/div/input)[2]")
	private WebElement firstname;
	@And("Enter Firstname as (.*)")
	public FindLead findLeadsSear(String data)
	{
		type(firstname, data);
		return this;
	}
	
	///Leadid ///
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	private WebElement leadidsear;
	@And("Pass leadid as (.*)")
	public FindLead leadidSear(String data)
	{
		type(leadidsear, data);
		return this;
	}
	
	
	///Lead id 2 cucumber///
		@FindBy(how=How.XPATH, using="//input[@name='id']")
		private WebElement leadidsea;
		@And("Enter Leadid")
		public FindLead leadidSea()
		{
			type(leadidsea, firstresultid);
			return this;
		}
		
	
	
	///Lead button ///
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findleadbut;
	@And("Clicking Leads button")
	public FindLead findLeadButton()
	{
		click(findleadbut);
		return this;
	}
	
	//Lead link///
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a)[1]")
	private WebElement leadid;
	@And("Click Firstleadid")
	public  ViewLeads leadidLink()
	{
		click(leadid);
		return new ViewLeads();
	}
	
	//Store First lead id///
	@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a)[1]")
	private WebElement firstleadid;
	public  String firstLeadid()
	{
		String text = getText(firstleadid);
		return text;
	}
	
	//Store First lead id cucumber///
		@FindBy(how=How.XPATH,using="(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a)[1]")
		private WebElement firstleadids;
		@And("Store the firstLead id")
		public  String firstLeadids()
		{
			 firstresultid = getText(firstleadids);
			return firstresultid;
		}
	
	///phone tab//
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement Phonetab;
	@And("Click Phone tab")
	public FindLead phoneClick()
	{
		click(Phonetab);
		return this;
	}
	
	//Phone num//
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement phonenum;
	@And("Enter Phonenumber as (.*)")
	public FindLead phonenumber(String data)
	{
		type(phonenum,data);
		return this;
	}

    // Text display //
	@FindBy(how=How.XPATH, using="//div[text()='No records to display']")
	private WebElement norectext;
	@Then("verify the text display as (.*)")
	public FindLead textDisplay(String data)
	{
	    verifyExactText(norectext,data);
		return this;
	}
	
	//Email link//
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement emaillink;
	@And("Click Email link")
	public  FindLead emailLink()
	{
		click(emaillink);
		return this;
	}
	
	//Email field//
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement emailfield;
	@And("Enter Emailid as (.*)")
	public FindLead emailField(String data)
	{
	type(emailfield, data);
	return this;
	}
	
	   //Store firstname///
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
		private WebElement firstnamevalue;
		public  String fNameValue()
		{
			String text = getText(firstnamevalue);
			return text;
		}
		
		
		//Store firstname cucumber///
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
		private WebElement firstnamevalues;
		@And("store first name value")
		public  String fNameValues()
		{
			firstnamestore = getText(firstnamevalues);
			return firstnamestore;
		}
		
	///firstnamevalue click///
		
		@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
		private WebElement fnameclick;
		@And("Click firstname")
		public  ViewLeads fnameClick()
		{
			click(fnameclick);
			return new ViewLeads();
		}
	
	
}
