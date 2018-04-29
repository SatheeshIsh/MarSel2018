package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	public DuplicateLead() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement dupcreateleadbutton;
	@And("click create lead button")
	public ViewLeads dupCreateLeadButton() {
		click(dupcreateleadbutton);
		return new ViewLeads();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
