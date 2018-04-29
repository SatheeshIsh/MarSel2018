package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class TapsPage extends ProjectMethods {
	
	public  TapsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement compfirstname;
	@And("update Companyname as (.*)")
	public TapsPage editCompName(String data)
	{
		type(compfirstname, data);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="(//td[@class='label']/following::td/input)[15]")
	private WebElement updatebut;
	@And("Click update button")
	public ViewLeads updButton()
	{
		click(updatebut);
		return new ViewLeads();
	}

}
