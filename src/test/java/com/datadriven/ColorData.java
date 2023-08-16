package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColorData {

	public static void main (String[] args) throws Exception {
		File file = new File("C:\\Users\\Ruban\\Selinium\\Nykaa.IPT\\Excel\\Data.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet sheet = workbook.getSheet("Color2");
		
		XSSFRow row = sheet.createRow(0);
		
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.BLUE_GREY.getIndex());
		cellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		cellStyle.setFillPattern(FillPatternType.SQUARES);
		
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Abc");
		cell.setCellStyle(cellStyle);
		
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}
	
}
