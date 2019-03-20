package TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.util;

public class Workouts {
	
WebDriver driver;
	
	public Workouts (WebDriver driver){
		this.driver= driver;
	}
	
	
	@FindBy(how=How.XPATH, using="html/body/div[3]/div/div/div[1]/div/div/ul[2]/li[2]/a")
	WebElement workoutTab;
	
	@FindBy(how=How.XPATH, using="//button[@type='button'][@class='btn dropdown-toggle actionCls'][@id='full-dropdown-button-action']")
	WebElement ActionButton;
	
	@FindBy(how= How.LINK_TEXT, using= "Create Workout")
	WebElement CreateWorkoutButton;
	
	@FindBy(how =How.XPATH, using="//input[@id='WorkoutName'][@class= 'form-control required'][@type='text']")
	WebElement WorkoutName;
	
	@FindBy(how = How.XPATH, using="//button[@class='btn pull-xs-right save-btn-no-scroll'][@type='submit'][@name='command']")
	WebElement CreateButton;
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/div[2]/section/div[2]/div[2]/div/div[2]/div[1]/section/div[6]/label/span[1]")
	WebElement Select1;
	

	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/div[2]/section/div[2]/div[2]/div/div[2]/div[2]/section/div[6]/label")
	WebElement Select2;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div/div/div[2]/div/div/div[2]/section/div[2]/div[4]/div/div[2]/div/button[2]")
	WebElement AddButton;
	
	@FindBy(how=How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div/div[1]/div[4]/div[1]/div[2]/div/button")
	WebElement SaveButton; 
	
	@Test
	public void WorkoutsList() throws InterruptedException, IOException
	{	
		
		Thread.sleep(3000l);
		workoutTab.click();	
	
		
		
	}
	@Test
	public Classes CreateWorkout() throws InterruptedException
	{	
		Thread.sleep(6000l);
		ActionButton.click();
		Thread.sleep(5000l);
		CreateWorkoutButton.click();
		Thread.sleep(3000l);
		WorkoutName.sendKeys("WorkoutOne");
		CreateButton.click();
		Thread.sleep(6000l);
		Select1.click();
		Select2.click();
		Thread.sleep(3000l);
		AddButton.click();
		Thread.sleep(3000l);
		SaveButton.click();
		Thread.sleep(3000l);
		/*workoutTab.click();*/// to verify if the workout is added in the list

		/*Thread.sleep(3000l);*/					
		// Write code for taking screen-shot to see if the workout is created.
		
		
		return PageFactory.initElements(driver, Classes.class);
		
	}

}
