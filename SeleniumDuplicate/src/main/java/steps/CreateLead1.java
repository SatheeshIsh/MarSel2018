package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLead1 {
	
	public static ChromeDriver driver;
	
	@Before
	public void before(Scenario sc)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();	
		 driver.get("http://www.leaftaps.com/opentaps");
		 System.out.println(sc.getName());
		 
	}
	
	/*@Given("Open the browser")
	public void browserLaunch()
	{
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver = new ChromeDriver();	
	}
	
	@And("Load URL")
	public void loadUrl() {	
		driver.get("http://www.leaftaps.com/opentaps");
		
	}*/
	
	@And("Enter Username1 as (.*)")
	public void enterUname(String data) {	
		driver.findElementById("username").sendKeys(data);
		
	}
	
	@And("Enter Password1 as (.*)")
	public void enterPassword(String data) {	
		driver.findElementById("password").sendKeys(data);
		
	}
	
	@And("click Login1")
	public void clickLogin() {		
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	
	@And("CRMSFA1")
	public void crmsfa() {		
		driver.findElementByLinkText("CRM/SFA").click();	
		
	}
	
	@And("Click leadstab1")
	public void leadsTab() {		
		
	driver.findElementByLinkText("Leads").click();
		
	}

	@And("Click createlead1")
	public void createLeads() {		
		driver.findElementByLinkText("Create Lead").click();
		}
	
	@And("Enter Companyname1 as (.*)")
	public void companyName(String data) {		
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		}
	
	@And("Enter firstname1 as (.*)")
	public void firstName(String data) {		
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		}
	
	@And("Enter Lastname1 as (.*)")
	public void lastName(String data) {		
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		}
	
	
	@And("Click Create Lead button1")
	public void createLeadButton() {		
		driver.findElementByName("submitButton").click();
		}
	
	/*@And("Close the browser")
	public void closeBroswer() {		
		driver.close();
		}*/
	
	
	@Then("Leads created successfully")
	public void justprinting() {		
		System.out.println("Created lead successfully");
		}
	
	@After
	public void after(Scenario sc)
	{
		driver.close();
		System.out.println(sc.getStatus());
	}
	
}
