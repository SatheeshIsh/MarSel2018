package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods {
	
	public  ViewLeads()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement viewfirstname;
	@And("verify the firstname as (.*)")
	public ViewLeads viewlead(String data)
	{
	    verifyExactText(viewfirstname, data);
		return this;
	}
	
	
	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement viewfirstnames;
	@And("compare first name")
	public ViewLeads viewleads()
	{
	    verifyExactText(viewfirstnames, firstnamestore);
		return this;
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement viewcompname;
	@And("verify company name as (.*)")
	public ViewLeads verifyCompanyName(String data)
	{
	    verifyPartialText(viewcompname, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement edit;
	@And("Click EditLead button")
	public TapsPage editButton()
	{
	    click(edit);;
		return new TapsPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement deletebut;
	@And("Click DeleteLead button")
	public MyLeads deletebutton()
	{
		click(deletebut);
		return new MyLeads();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicatebut;
	@And("click duplicate lead button")
	public DuplicateLead duplicateLeadBut()
	{
		click(duplicatebut);
		return new DuplicateLead();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement findleadbut;
	@And("Click Findleadbutton")
	public FindLead findLeadbutton()
	{
		click(findleadbut);
		return new FindLead();
	}
	
	
	

}
