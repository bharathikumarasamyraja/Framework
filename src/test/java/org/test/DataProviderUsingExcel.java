package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;

public class DataProviderUsingExcel {
	
	@DataProvider
	public String[][] excelReader() throws IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\ExcelSheet\\datas.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("login");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(1).getPhysicalNumberOfCells();
		String [] [] arr = new String [rowcount-1][cellcount];
		
		for(int i =1; i<rowcount;i++)
		{
			Row row = sheet.getRow(i);
			for(int j= 0;j<cellcount;j++)
			{
				Cell cell = row.getCell(j);
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(cell);
				arr[i-1][j] = data;
				
			}
		}
		
		return arr;
	}

}
