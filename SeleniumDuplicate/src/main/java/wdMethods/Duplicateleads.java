package wdMethods;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Duplicateleads extends LoginApp {

	@Test(enabled=true,groups="sanity")
	public void duplicateleads()
	{
		//leadslogin();
		WebElement Leads = locateElement("linktext", "Leads");
		click(Leads);
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("Xpath", "//span[text()='Email']"));
		type(locateElement("name","emailAddress"), "babu@testleaf.com");
		click(locateElement("Xpath", "(//button[@class='x-btn-text'])[7]"));
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")));
		
		String lead= getText(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		click(locateElement("linktext", "Duplicate Lead"));
		verifyTitle("Duplicate Lead");
		
		click(locateElement("name", "submitButton"));
		verifyPartialText(locateElement("id", "viewLead_firstName_sp"),lead);
		//closeapp();
	}
	 
}
