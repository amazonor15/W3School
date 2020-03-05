package allPAges;

import org.openqa.selenium.WebDriver;

public class HomePage extends SupplyChain {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	public void URL() {
		driver.get("https://www.w3schools.com/");
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
}
