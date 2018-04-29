package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods {
	
	public MyHome()
	{
		System.out.println(driver.getTitle());
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")
	private WebElement leadsclick;
	@And("Click leadstab")
	public MyLeads leadsLink() {
		//Thread.sleep(2000);	
		click(leadsclick);
		return new MyLeads();		
	}
	
	
	

}
