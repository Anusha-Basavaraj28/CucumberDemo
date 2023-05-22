package com.demo.Utility;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataReader {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	
	
	public static String[] getDataFromExcel(String row) throws Exception {
		
	
	
String path="C://Users//anush//eclipse-workspace//CucumberDemo//src//test//java//com//demo//TestData//Opencart_LoginData.xlsx";
	
	
	FileInputStream fi=new FileInputStream(path);
	
	wb=new XSSFWorkbook(fi);
	
	sheet=wb.getSheet("Sheet1");
	
	int rowNUmber=Integer.parseInt(row);
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+rowNUmber);
	
	int columns=sheet.getRow(rowNUmber).getLastCellNum();
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+columns);
	String[] sd=new String[columns];
	
	for(int j=0;j<columns;j++) {
		
		
		cell=sheet.getRow(rowNUmber).getCell(j);
		
		DataFormatter formatter=new DataFormatter();
		
		String s=formatter.formatCellValue(cell);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+s);
		
		
		sd[j]=s;
		
	}
	
	
	
	
	return sd;
	
	}
}
