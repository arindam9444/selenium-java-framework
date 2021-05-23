package com.TestCases;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import ExcelData.XLUtils;

public class ExcelDataExtractor
{
@DataProvider(name="empdataProvider")
String[][] getemployeeData() throws IOException
	{
	 
		String path=System.getProperty("user.dir")+"/src/test/java/empData.xlsx";
	      int rowcount=XLUtils.getRowCount(path, "Sheet1");
		  int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		  
		 String empData[][]=new String[rowcount][colcount];
		 
		 for(int i =1; i<=rowcount; i++)
		 {
			for(int j=0;j<colcount;j++)
			{
				empData[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
				
				
			}
		 }

		
		
		return(empData);
}
}