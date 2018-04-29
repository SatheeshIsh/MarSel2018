package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateLeads;
	@And("Click createlead")
	public CreateLeads  myleads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elecreateLeads);
		return new CreateLeads();		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindLeads;
	
	@And("Click FindLeads")
	public FindLead  findLead() {
		click(elefindLeads);
		return new FindLead();		
	}
	

	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;
	@And("Click MergeLeads")
	public MergeLeads mergeLead()
	{
		click(elemergelead);
		return new MergeLeads();
	}
	
	

}
