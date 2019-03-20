package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Excelreader.ExcelReader;
import dd_core.testcore;

 

public class util extends testcore{
	
	
	//To check if test case to be executed----------
	public static boolean isExecutable(String TestCaseName, ExcelReader excel){
		String sheetname= "TestCases";
		for(int rowNum=2; rowNum<=excel.getRowCount("TestCases"); rowNum++){
			
			if(excel.getCellData(sheetname, "TestCase_Name", rowNum).equals(TestCaseName)){
				if(excel.getCellData(sheetname, "Run", rowNum).equalsIgnoreCase("Y")){
					
					return true;
					
					}
				else{
					
					return false;
					}
			
			}
		
		}
		
		return false;
		
	}

	// To read excel file--------------
		public static Object[][] getData(String sheetName){
			
			
			
			int rows = excel.getRowCount(sheetName);
			int cols= excel.getColumnCount(sheetName);
			
			Object[][] data = new Object[rows-1][cols];
			
			for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
				
				
				
				for(int colNum=0 ; colNum< cols; colNum++){
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
				}
			}
			
			return data;
			
			
			
		}

		
		public static void CaptureScreenshot() throws IOException{
			
			  Calendar cal = new GregorianCalendar();
			  int month = cal.get(Calendar.MONTH); //3
			  int year = cal.get(Calendar.YEAR); //2014
			  int sec =cal.get(Calendar.SECOND);
			  int min =cal.get(Calendar.MINUTE);
			  int date = cal.get(Calendar.DATE);
			  int day =cal.get(Calendar.HOUR_OF_DAY);
			
			 /* String mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";*/
			 /* String mailscreenshotpath = System.se("E:\\Selenium-Kuldeep\\CFL_POM\\screenshots\\img.jpeg");*/
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile, new File("E:\\Selenium-Kuldeep\\CFL_POM\\screenshots\\img1.png"));
			
			
		}
		


}





