package learnGroups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.LoginApp;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Duplicateleads3 extends LoginApp {

	

	@Test(enabled=false)
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
