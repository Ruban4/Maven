package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main (String[] args) throws Exception  {
	
	File File = new  File("C:\\Users\\Ruban\\Selinium\\Nykaa.IPT\\Excel\\Data.xlsx");
	FileInputStream fis = new FileInputStream(File);
	Workbook workbook = new XSSFWorkbook(fis);
	Sheet sheet = workbook.getSheet("Credentials");
	Row row = sheet.createRow(0);
	Cell cell = row.createCell(0);
	cell.setCellValue("UserName");
	
	Sheet sheet2 = workbook.getSheet("Credentials");
	Row row2 = sheet2.getRow(0);
	Cell cell2 = row2.createCell(1);
	cell2.setCellValue("password");
	
	workbook.getSheet("Credentials").createRow(1).createCell(1).setCellValue("ABC");
	
	FileOutputStream fos = new FileOutputStream(File);
    workbook.write(fos);
    workbook.close();

}
} 