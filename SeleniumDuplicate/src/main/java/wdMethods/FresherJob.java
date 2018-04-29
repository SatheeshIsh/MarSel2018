package wdMethods;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FresherJob extends SeMethods {
	@Test
	public void jobtile() {

		startApp("chrome", "https://www.indeed.co.in/Fresher-jobs");

		clickNoSnap(locateElement("Xpath", "//div[@id='rb_Title']/div[2]/div/span"));
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='TITLE_rbo']/ul/li/a"));
		System.out.println(list.size());
		for (WebElement ele: list)
		{
			System.out.println(ele.getText());
		}
		
		 Actions build = new Actions(driver);
		 build.sendKeys(Keys.CONTROL).click().perform();
    
	/*
		Actions build = new Actions(driver);
		
		build.sendKeys(Keys.CONTROL).click((elem).perform();
		build.sendKeys(Keys.CONTROL).click(elem).perform();
*/
		
	/*	Set<String> win = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>();
		windowlist.addAll(win);
		for (String lists : windowlist) {
			System.out.println(lists);
		}

		driver.switchTo().window(windowlist.get(1));
		System.out.println(driver.getTitle());
		driver.close();*/

	}

}
