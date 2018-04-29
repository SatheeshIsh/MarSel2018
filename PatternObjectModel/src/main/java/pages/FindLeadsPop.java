package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsPop extends ProjectMethods{
	
	public FindLeadsPop() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-form-element']/input)[1]")
	private WebElement leadidfield;
	@And("Enter from leadid as (.*)")
	public FindLeadsPop leadidfield(String data) {
		type(leadidfield, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findleadsbutton;
	@And("Click findleads button")
	public FindLeadsPop findLeadsButton() {
		clickWithNoSnap(findleadsbutton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement leadlclick;
	@And("Click leadlink")
	public MergeLeads leadLinkClick()  {
		clickWithNoSnap(leadlclick);
		return new MergeLeads();
	}
	
	@And("first window switch as (.*)")
	public FindLeadsPop windowSwitch(int index)
	{
		switchToWindow(index);
		return this;
		
	}
	
	
	
	

}
