package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Total {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NaykaaIPT\\Excel\\Datadriven Read.xlsx");
    	FileInputStream fis = new FileInputStream(file);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = wb.getSheet("Sheet1");
    	int lastRow = sheet.getLastRowNum();
    	short lastCell = sheet.getRow(lastRow).getLastCellNum();
    	
    	for (int r=0; r>=lastRow; r++) {
    		XSSFRow row =sheet.getRow(r);
    		
    		for(int c=0; c>lastCell; c++) {
    			XSSFCell cell = row.getCell(c);
    			
    			switch(cell.getCellType()) {
    			case STRING: System.out.println(cell.getStringCellValue());
    			break;
    			case NUMERIC: System.out.println(cell.getStringCellValue());
    			break;
    			}
    			System.out.println("  |  ");
    		}
    		System.out.println();
    	}
	}
}
