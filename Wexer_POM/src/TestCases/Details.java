package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Details{

	WebDriver driver;
	public Details(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	//*[@id=\"details\"]/a
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[1]/div/div/ul[2]/li[6]/a")
	WebElement DetailsTab;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/section/div[1]/div/ul/li[1]/a/span[1]")
	WebElement AboutYouTab;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/section/div[2]/div[1]/div/div/div[2]/div[2]/div/button")
	WebElement FitnessGoal;
	@FindBy(how= How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/section/div[2]/div[1]/div/div/div[2]/div[2]/div/div/ul/li[2]/a/span[1]")
	WebElement FitnessGoalLenear;
	@FindBy(how=How.XPATH, using="//*[@id=\"txtsection1_Heading1_Label2\"]")
	WebElement GeneralExpectation;
	
	
	public Sample AboutYou() throws InterruptedException {
		Thread.sleep(6000l);
		DetailsTab.click();
		Thread.sleep(3000l);
		AboutYouTab.click();
		Thread.sleep(3000l);
		FitnessGoal.click();
		Thread.sleep(3000l);
		FitnessGoalLenear.clear();
		Thread.sleep(3000l);
		GeneralExpectation.sendKeys("Kuldeep");
		Thread.sleep(3000l);
		return PageFactory.initElements(driver, Sample.class );
		/* WebElement slider = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[2]/div[1]/div/div/div[4]/div[2]/p/span/span[6]"));
		    Actions move = new Actions(driver);
		    Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		    ((Actions) action).perform();*/
		
	}

}
