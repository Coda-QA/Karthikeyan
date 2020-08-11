package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import New.Program.SuperClass;
import PageObjects.Search;


public class goIbibo extends SuperClass {
	
	Search obj ;
	
	@Test
	public void f() throws InterruptedException {

		Actions a = new Actions(driver);		
		

		
	/*	obj.from().sendKeys("CHENNAI");
		obj.from().click();
		obj.from().sendKeys(Keys.ARROW_DOWN);
		obj.from().sendKeys(Keys.ENTER);
		
		*/


		WebElement from =   driver.findElement(By.id("gosuggest_inputSrc"));
		from.sendKeys("CHENNAI");


		Action b = a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		b.perform();		

		WebElement to =   driver.findElement(By.id("gosuggest_inputDest"));
		to.sendKeys("PUNE");
		to.click();   

		b = a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		b.perform();


		WebElement departure = driver.findElement(By.id("departureCalendar"));
		departure.click();
		
		WebElement dept_date = driver.findElement(By.id("fare_20200811"));
		dept_date.click();
		
		
		WebElement returns = driver.findElement(By.id("returnCalendar"));
		returns.click();
		
		WebElement returns_date = driver.findElement(By.id("fare_20200813"));
		returns_date.click();
		
		
		WebElement search = driver.findElement(By.id("gi_search_btn"));
		search.click();
		
		Thread.sleep(10000);
		
	}
}
