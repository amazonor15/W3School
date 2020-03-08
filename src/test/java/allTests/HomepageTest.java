package allTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

public class HomepageTest {

	
	CoreOfTests instance = CoreOfTests.getInstance();
	@Test
	public void validateTitle3() {
		instance.getDriver("firefox");
		instance.getHomePage().URL();
		String title= instance.getHomePage().getTitle();
		System.out.println(title);
		
		AssertJUnit.assertEquals(title, "W3Schools Online Web Tutorials");
	}
	
	
	
	@Test
	public void HomereferenceValidation() {
		
		instance.getDriver("chrome");
		instance.getHomePage().URL();
		instance.getHomePage().GetHomeReferance();
		
		String reftext= instance.getHomePage().clickTextResult();
		System.out.println(reftext);
		
		Assert.assertEquals(reftext, "REFERENCES");
		
	}
	
	
	@AfterClass
	public void teardown() {
		instance.driver.close();
	}
	
}
