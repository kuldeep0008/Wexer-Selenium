package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Sample {

	WebDriver driver;
	public Sample(WebDriver driver) {
		this.driver =driver;
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
	
	
	public void AboutYou2() throws InterruptedException {
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
		//return PageFactory.initElements(driver, Bioscore.class );
		/* WebElement slider = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/section/div[2]/div[1]/div/div/div[4]/div[2]/p/span/span[6]"));
		    Actions move = new Actions(driver);
		    Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		    ((Actions) action).perform();*/
		
	}
}
