package parameters;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class LoginApp extends SeMethods{
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void leadslogin(String url, String username,String password )
	{
		startApp("chrome",url);
		//WebElement user=locateElement("id","username");
		//WebElement pass=locateElement("id","password");
		type(locateElement("id","username"),username);
		type(locateElement("id","password"),password);
		WebElement submit=locateElement("class","decorativeSubmit");
		click(submit);
		WebElement CRMlink = locateElement("linktext","CRM/SFA");
		click(CRMlink);
	}
	
	@AfterMethod
	public void closeapp()
	{
      driver.close();
	}

}
