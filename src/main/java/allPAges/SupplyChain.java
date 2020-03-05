package allPAges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupplyChain {

	WebDriver driver;
	
	public SupplyChain (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void getUrl(String url) {
		driver.get(url);
	}
	

	public void findElement (String element) {
		driver.findElement(By.xpath(element)).click();
	}
	
	
	public String getText(String text) {
		return driver.findElement(By.xpath(text)).getText();
		
	}
	
	
}
