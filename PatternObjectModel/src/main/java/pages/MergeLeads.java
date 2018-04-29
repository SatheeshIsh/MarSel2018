package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='ComboBox_partyIdFrom']/following::a[1]")
	private WebElement firsticon;
	@And("Click from lead link")
	public FindLeadsPop firstIcon()
	{
	clickWithNoSnap(firsticon);
	return new FindLeadsPop();
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='partyIdTo']/following::a[1]")
	private WebElement secondicon;
	@And("click To Lead link")
	public FindLeadsPop secondIcon()
	{
	clickWithNoSnap(secondicon);
	return new FindLeadsPop();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement mergebutton;
	@And("Click Merge button")
	public MergeLeads mergeButton()
	{
	click(mergebutton);
	return this;
	}
	
	@And("Click Yes Alert")
	public ViewLeads alertClick()
	{
		acceptAlert();
		return new ViewLeads();
	}
	
	@And("Zero window switch as (.*)")
	public MergeLeads windowSwitch(int index)
	{
		switchToWindow(index);
		return this;
		
	}

}
