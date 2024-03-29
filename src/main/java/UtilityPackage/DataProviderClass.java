package UtilityPackage;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import SetUpPackage.TestSetup;

public class DataProviderClass extends TestSetup{
	
	@DataProvider(name = "dp")
	public static Object[][] getData(Method m) 
	{
		String sheetName = m.getName(); //getting the name of testcase method
		int rows = excel.getRowCount(sheetName);// 3
		int cols = excel.getColumnCount(sheetName);// 2
		// int[][] array= new int[5][4];
		Object[][] data = new Object[rows - 1][1];// [2][1]
		// int[] array= new int[1][1];
		// array[0][0]=10
		Hashtable<String, String> table = null;
		for (int rowNum = 2; rowNum <= rows; rowNum++) 
		{// rows=3
	
				table = new Hashtable<String, String>();
			for (int colNum = 0; colNum < cols; colNum++) 
			{// cols=2
				table.put(excel.getCellData(sheetName, colNum, 1), 
						excel.getCellData(sheetName, colNum, rowNum));
				
				
				data[rowNum - 2][0] = table;// {endPoint=/customer,expectedCode=200}
			}
		}
		return data;
		// System.out.println(data); return data;
	}

}
