package New.Program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
/**
 * CLASS NAME - SuperClass
 * DESCRIPTION - This class contains methods to start and close a browsers
 * @author User - Karthikeyan
 *
 */
public class SuperClass {

	public static WebDriver driver;
	

	/**
	 *  METHOD NAME - InvokeBrowser
	 * DESCRIPTION - This method is used to the webdriver started
	 * @author User - Karthikeyan
	 */
	@BeforeTest
	public void InvokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace5\\Program\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com");


	}
	/**
	 * METHOD NAME - CloseBrowser
	 * DESCRIPTION - This method is used to the webdriver started
	 * @author User - Karthikeyan 
	 */
	@AfterTest
	public void CloseBrowser() {

		driver.close();

	}

}
