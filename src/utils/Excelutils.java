package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutils 
{
	// this method reads data from an excel sheet and returns it as a 2D object array (Object[][])
			public static Object[][] getTestData(String filePath, String sheetName) throws Exception
			{
				
				FileInputStream fis = new FileInputStream(filePath); // read excelpath
				XSSFWorkbook workbook = new XSSFWorkbook(fis); // get excel workbook
				XSSFSheet sheet = workbook.getSheet(sheetName); // to get the sheet
				
				
				int rows = sheet.getLastRowNum(); // excluding header
				int cols = sheet.getRow(0).getLastCellNum();
				
				System.out.println(rows);
				System.out.println(cols);
				
				
				Object[][] data = new Object[rows][cols]; // create 2d object array, it can store multiple rows and columns
				DataFormatter formatter = new DataFormatter(); // converts all cell values to string format.
				
				
				for (int i=1;i<=rows;i++) // start from 1 (skip header)
				{
					for (int j=0;j<cols;j++)
					{
						data[i-1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j)); // data[i-1]
					}
				}
				workbook.close();
				fis.close();
				
				return data;
			}
			//object is the superclass of all classes in java.since every class implicitly extends object,
			//an object references can hold values of any data type , such as string , integer , double,or boolean.
			
			//Excel numeric values are returned as double by default.
			//dataformatter converts the cell values into a formatted string and preserves how it is displayed in excel
			//for example , it returns "1234" instead of 1234.0.

		}



