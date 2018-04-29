package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{
	
	public CreateLeads() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyname;
	@And("Enter Companyname as (.*)")
	public CreateLeads enterCompanyname(String data) {
		type(eleCompanyname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	@And("Enter firstname as (.*)")
	public CreateLeads enterFirstname(String data) {
		type(eleFirstname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastname;
	@And("Enter Lastname as (.*)")
	public CreateLeads enterLasttname(String data) {
		type(eleLastname, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elecreateleadbutton;
	@And("Click Create Lead button")
	public ViewLeads createleadbutton() {
		click(elecreateleadbutton);
		return new ViewLeads();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
