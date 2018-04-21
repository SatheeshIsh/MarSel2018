package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import parameters.Excel;

public class SeMethods implements WdMethods{

	 protected RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
			
		} catch (NullPointerException e) {
			System.err.println("NullPointerException is displayed");
			e.printStackTrace();
		}
		  catch (WebDriverException e) {
			System.err.println("WebDriverException is displayed");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception is displayed");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linktext":
				ele=driver.findElementByLinkText(locValue);
				break;
			case "name":
			    ele=driver.findElementByName(locValue);
			    break;
			case "Xpath":
			   ele=driver.findElementByXPath(locValue);
			   break;
			case "Partial":
			   ele=driver.findElementByPartialLinkText(locValue);
			}
		} catch (NullPointerException e) {
			System.err.println("NullPointerException is displayed");
			e.printStackTrace();
		}
		  catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException is displayed");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception is displayed");
			e.printStackTrace();
		} 
		return ele;
		
	}
	
	public List<WebElement> locateElements(String locator, String locValue) {
		List<WebElement> ele1 = null;
			switch (locator) {
			case "Xpath1":
				ele1 = driver.findElementsByXPath(locValue);
			}
			return ele1;
			}
			
	public WebElement locateElement(String locValue) {
		WebElement ele = null;
		try {
			ele=driver.findElementById(locValue);
		} catch (NullPointerException e) {
			System.err.println("NullPointerException is displayed");
			e.printStackTrace();
		}
		  catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException is displayed");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception is displayed");
			e.printStackTrace();
		} 
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException is displayed");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.err.println("NullPointerException is displayed");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception is displayed");
			e.printStackTrace();
		} finally {
		takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException is displayed");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.err.println("NullPointerException is displayed");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Exception is displayed");
			e.printStackTrace();
		} finally {
		takeSnap();
		}
		
		}
	
	public void clickNoSnap(WebElement ele) {
	
		ele.click();
		System.out.println("The element is clicked successfully");
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("The text is" + " " + text);
		takeSnap();
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		new Select(ele).selectByVisibleText(value);
		System.out.println("The selected text is" + ele);
		takeSnap();

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
		System.out.println("The selected text is" + ele);
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle) {
	    String title = driver.getTitle();
	    System.out.println(title);
		if (expectedTitle.equals(title))
	    {
	    	
			System.out.println("The title displayed is" + title);
	    }
		
		return false;
	}
  
	
	public void verifyExactText(WebElement ele, String expectedText) {
	   String exptext = ele.getText();
	   if (exptext.equals(expectedText))
	   {
		   System.out.println("The text "+ele.getText()+" is matched with "+expectedText);   
	   }else
	   {
			System.out.println("text not match");
		}
		takeSnap();

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
	  
		if (ele.getText().contains(expectedText))
		{
			System.out.println("The text" + ele.getText()+" is matched with" + expectedText );
		} else
		   {
				System.out.println("text not match");
			}
			takeSnap();

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		
		if (ele.getAttribute(attribute).equals(value))
		{
			System.out.println("The Extact Attribute is" + value);
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).contains(value))
		{
			System.out.println("The Attribute is" + value);
		}

	}

	public void verifySelected(WebElement ele) {
		
		if (ele.isSelected())
		{
			System.out.println("The element is" + ele.isSelected());
		}

	}

	public void verifyDisplayed(WebElement ele) {

		if (ele.isDisplayed())
		{
			System.out.println("The element is" + ele.isDisplayed());
		}

	}

	public void switchToWindow(int index) {
		try {
			Set<String> windows = driver.getWindowHandles();
			List<String> winlist = new ArrayList<String>();
			winlist.addAll(windows);
			driver.switchTo().window(winlist.get(index));
			System.out.println("The window is switched");
		
		} catch (NoSuchWindowException e) {
			System.err.println("NoSuchWindowException is displayed");
			e.printStackTrace();
		} 

	}
	
	public void switchToWindow1(int index) {
		try {
			Set<String> windows1 = driver.getWindowHandles();
			List<String> winlist1 = new ArrayList<String>();
			winlist1.addAll(windows1);
			driver.switchTo().window(winlist1.get(index));
			System.out.println("The window is switched");
			
		} catch (NoSuchWindowException e) {
			System.err.println("NoSuchWindowException is displayed");
			e.printStackTrace();
		} finally
		{
			takeSnap();
		}

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("Switched to frame");
		takeSnap();

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert accepted");
		}catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException is displayed");
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException is displayed");
			e.printStackTrace();
		} 

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert dismissed");
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException is displayed");
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException is displayed");
			e.printStackTrace();
		} 
	}

	public String getAlertText() {
		String alerttext=null;
		try {
			alerttext = driver.switchTo().alert().getText();
			System.out.println("The Alert text is" + alerttext);
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException is displayed");
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException is displayed");
			e.printStackTrace();
		} 
		return alerttext;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

	@Override
	public void verifyExactText(String text, String expectedText) {
	
		   if (text.equals(expectedText))
		   {
			   System.out.println("The text "+text+" is matched with "+expectedText);   
		   }else
		   {
				System.out.println("text not match");
			}
			takeSnap();
		
	}
	


}
