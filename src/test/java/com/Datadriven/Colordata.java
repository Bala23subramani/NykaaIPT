package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Colordata {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\NaykaaIPT\\Excel\\Datadriven Read.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("Color");
		XSSFRow row = sheet.createRow(0);
		
		XSSFCellStyle style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BROWN.getIndex());
		style.setFillPattern(FillPatternType.SQUARES);
		
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Bala");
		cell.setCellStyle(style);
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}
}
