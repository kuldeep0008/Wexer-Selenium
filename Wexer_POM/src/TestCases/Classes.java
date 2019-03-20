package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.util;

public class Classes {
WebDriver driver;

	public  Classes(WebDriver driver){
		this.driver= driver;
	}
	@FindBy(how=How.XPATH, using = "/html/body/div[3]/div/div/div[1]/div/div/ul[2]/li[3]/a")
	WebElement ClassTab;
	@FindBy(how= How.ID, using ="hk-advancedflowyoga")
	WebElement FavoriteIcon1;
	@FindBy(how= How.XPATH, using ="hk-advancedyoga")
	WebElement FavoriteIcon2;
	@FindBy(how =How.XPATH, using ="//*[@id=\"searchinput\"]")
	WebElement SearchInput;
	@FindBy(how= How.ID, using="favourite-classes")
	WebElement Favorite_Classes;
	@FindBy(how=How.XPATH,using="//*[@id=\"ClassSearchButton\"]")
	WebElement SearchButton;
	
	public void ClassSection() throws InterruptedException
	{
		Thread.sleep(20000l);
		ClassTab.click();//clicked on class tab
		
	}
	 public Planner favoriteClass() throws InterruptedException, IOException
	 {	
	 Thread.sleep(3000l);
		/* FavoriteIcon1.click();
		 Thread.sleep(3000l);
		 FavoriteIcon2.click();*/
		 Thread.sleep(6000l);
		 SearchInput.sendKeys("Bodyattack");
		 Thread.sleep(6000l);
		 SearchButton.click();
			return PageFactory.initElements(driver, Planner.class);
			
			
}
	
	
	
}
