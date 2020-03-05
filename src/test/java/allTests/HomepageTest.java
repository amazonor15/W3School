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
		instance.getDriver("chrome");
		instance.getHomePage().URL();
		String title= instance.getHomePage().getTitle();
		System.out.println(title);
		
		AssertJUnit.assertEquals(title, "W3Schools Online Web Tutorials");
	}
	
	
	
	@AfterClass
	public void teardown() {
		instance.driver.close();
	}
	
}
