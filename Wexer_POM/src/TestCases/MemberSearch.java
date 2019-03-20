package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MemberSearch{
	
	WebDriver driver;
	
	public MemberSearch (WebDriver driver){
		this.driver= driver;
	}
	@FindBy(how=How.XPATH, using="//input[@class = 'form-control touchspin-height SearchElement'][@id='searchTerm'][@name='searchTerm']")
	WebElement searchName;
	
	@FindBy(how=How.XPATH, using="//button[@class='btn SearchElement'][@type='submit']")
	WebElement searchbutton;
	
	@FindBy(how=How.CSS, using="td.sorting_1")
	WebElement SearchResult;
	
	@Test
	public Workouts MemberSearch_Details(String name) throws InterruptedException
	{	Thread.sleep(6000l);
		searchName.sendKeys(name);
		Thread.sleep(6000l);
		searchbutton.click();
		Thread.sleep(6000l);
		SearchResult.click();
		Thread.sleep(5000l);
		return PageFactory.initElements(driver, Workouts.class);
	}
	
	
	
	
	
	
}
