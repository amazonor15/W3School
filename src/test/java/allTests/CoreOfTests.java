package allTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPAges.HomePage;

public class CoreOfTests {
	
    private static CoreOfTests instance;
    
    WebDriver driver;
    HomePage page;
    
    
    
    private CoreOfTests() {
		
	}
    
    
    
    public WebDriver getDriver(String driverValue) {
		if (driver==null) {
			if (driverValue.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/shahid2/Desktop/bootCamp1/pnt2-mct-autoproject/chromedriver");
				driver = new ChromeDriver();
				
			} else if (driverValue.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/shahid2/Desktop/bootCamp1/pnt2-mct-autoproject/geckodriver");
				driver = new FirefoxDriver();
				
			}
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
		
		
		
	}
    
    public static CoreOfTests getInstance() {
    	if (instance==null) {
    		instance=new CoreOfTests();
			
		}
    	return instance;
		
	}
    
    public  HomePage getHomePage() {
    	if (page==null) {
    		page= new HomePage(driver);
			
		}
		return page;
		
	}
    
	
}
