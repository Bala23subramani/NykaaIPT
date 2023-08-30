package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NaykaaIPT\\Excel\\Datadriven Read.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("Sample");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("first");
		wb.getSheet("Sample").createRow(0).createCell(1).setCellValue("second");
		wb.getSheet("Sample").createRow(1).createCell(0).setCellValue("third");
		wb.getSheet("Sample").createRow(1).createCell(1).setCellValue("fourth");
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
}
