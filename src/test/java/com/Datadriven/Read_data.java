package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {

    public static void main(String[] args) throws Exception {
		
    	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NaykaaIPT\\Excel\\Datadriven Read.xlsx");
    	FileInputStream fis = new FileInputStream(file);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = wb.getSheet("Sheet1");
    	XSSFRow row = sheet.getRow(0);
    	XSSFCell cell = row.getCell(2);
    	
    	System.out.println(cell);
    	
	}
}
