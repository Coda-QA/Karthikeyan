package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class Search {
	
	WebDriver driver;
	
	By from = By.id("gosuggest_inputSrc");
	By To = By.id("gosuggest_inputDest");
	By departure  = By.id("departureCalendar");
	By dept_date = By.id("fare_20200813");
	By returns = By.id("returnCalendar");
	By returns_date = By.id("fare_20200814");
	By search = By.id("gi_search_btn");
	
	

	public Search(WebDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	


	public WebElement from(){
		return driver.findElement(from);
	
		

		
	}
	
	


}
