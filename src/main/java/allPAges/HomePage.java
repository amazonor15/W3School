package allPAges;

import org.openqa.selenium.WebDriver;

public class HomePage extends SupplyChain {

	String homeReferancetxt= "//a[@id='navbtn_references']";
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	public void URL() {
		driver.get("https://www.w3schools.com/");
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	
	public void GetHomeReferance() {
		clickElement(homeReferancetxt);
		
		
	}
	
	
	public String clickTextResult() {
		return getText(homeReferancetxt);
		
	}
	
	
}
