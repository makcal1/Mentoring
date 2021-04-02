package com.mentoring.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	public static Workbook book;
	public static Sheet sheet;
	
	public static String TESTDATA_SHEET_DATA = "C:\\Users\\muham\\eclipse-workspace\\MentorringWebPage\\src\\main\\java\\com\\mentoring\\testdata\\Deneme.xlsx";	

public static Object[][] getTestData(String sheetName) {
		
		try {
	
			FileInputStream ip = new FileInputStream(TESTDATA_SHEET_DATA);
		
			book = WorkbookFactory.create(ip);
		
			sheet = book.getSheet(sheetName);
		
			
			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i = 0; i < sheet.getLastRowNum(); i++) {
				
				for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					 
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();
					System.out.println(data[i][k]);
				}
			}
			
			return data;
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		return null;
		}catch (Exception e) {
			System.out.println("Data Problem");
		return null;
		}
		
	}
}
