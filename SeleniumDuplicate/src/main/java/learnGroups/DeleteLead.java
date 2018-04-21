package learnGroups;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead extends LoginApp {

	@Test(groups="Sanity",dependsOnGroups= {"smoke"})
	public void delete() throws InterruptedException {
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		WebElement user = locateElement("id", "username");
		WebElement pass = locateElement("id", "password");
		type(locateElement("id", "username"), "DemoSalesmanager");
		type(locateElement("id", "password"), "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		WebElement CRMlink = locateElement("linktext", "CRM/SFA");
		click(CRMlink);*/
		//leadslogin();
		WebElement Leads = locateElement("linktext", "Leads");
		click(Leads);
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("Xpath", "//span[text()='Phone']"));
		//Commented for TEstNG testing
		type(locateElement("Xpath","//input[@name='phoneNumber']") ,"8939326843" );
		click(locateElement("Xpath", "(//td[@class='x-btn-left'])[1]/following::button[7]"));
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a")));
		
		String lead= getText(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a"));
		click(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a"));
		click(locateElement("Xpath", "//div[text()='Lead']/following::a[4]"));
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("Xpath", "(//div[@class='x-form-item x-tab-item'])[1]//input" ),lead );
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		Thread.sleep(5000);
		getText(locateElement("Xpath", "//div[text()='No records to display']"));
		verifyExactText(locateElement("Xpath", "//div[text()='No records to display']"),  "No records to display") ;
		//Commented for TEstNG testing
		//closeapp();
		
	}

}
