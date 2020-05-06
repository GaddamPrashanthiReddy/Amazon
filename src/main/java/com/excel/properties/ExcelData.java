package com.excel.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static String getUrl() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/dataproperties.xlsx");
		
		//we create an XSSF workbook object for xslx Excel file
		Workbook wb=new XSSFWorkbook(fis);
		//we get first sheet 
		String Url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		return Url;
		}
	
	public static String getEmailId() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/dataproperties.xlsx");
		
		//we create an XSSF workbook object for xslx Excel file
		Workbook wb=new XSSFWorkbook(fis);
		//we get first sheet 
		String EmailId = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		return EmailId;
	}
	
	public static String getPassword() throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/dataproperties.xlsx");
	
	//we create an XSSF workbook object for xslx Excel file
	Workbook wb=new XSSFWorkbook(fis);
	//we get first sheet 
	String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	return password;
	}

}
