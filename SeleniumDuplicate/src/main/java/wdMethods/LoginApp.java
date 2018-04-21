package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginApp extends SeMethods{
	
	@BeforeMethod()
	public void leadslogin()
	{
		startApp("chrome","http://www.leaftaps.com/opentaps");
		WebElement user=locateElement("id","username");
		WebElement pass=locateElement("id","password");
		type(locateElement("id","username"),"DemoSalesmanager");
		type(locateElement("id","password"),"crmsfa");
		WebElement submit=locateElement("class","decorativeSubmit");
		click(submit);
		WebElement CRMlink = locateElement("linktext","CRM/SFA");
		click(CRMlink);
	}
	
	@AfterMethod()
	public void closeapp()
	{
      driver.close();
	}

}
