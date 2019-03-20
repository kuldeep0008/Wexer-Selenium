package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Planner {
	
	WebDriver driver;
	public Planner (WebDriver driver){
		this.driver= driver;
	}
	
	@FindBy(how= How.XPATH, using="/html/body/div[3]/div/div/div[1]/div/div/ul[2]/li[4]/a")
	WebElement PlannerTab;
	@FindBy(how=How.XPATH, using="//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div[2]/div/div[3]/table/tbody/tr/td[5]/div/div[3]/div")
	WebElement TimeSlot;
	public Bioscore AddPlanner() throws InterruptedException
	{
		PlannerTab.click();//Clicked on Planner Tab
		Thread.sleep(3000l);
		/*
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		Thread.sleep(3000l);
		TimeSlot.click();*/
		return PageFactory.initElements(driver, Bioscore.class);
		
	}
	
	

}