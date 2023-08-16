package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple {

	public static void main (String[] args) throws Exception {
		
		File file = new File("C:\\Users\\Ruban\\Selinium\\Nykaa.IPT\\Excel\\Data.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		
		for(int r=0; r<=row; r++) {
			
			XSSFRow row2 = sheet.getRow(r);
			
			for(int c=0; c<cell; c++) {
				
				XSSFCell cell2 = row2.getCell(c);
				
				switch(cell2.getCellType()) {
				
				case STRING: System.out.print(cell2.getStringCellValue());
				break;
				
				case NUMERIC: System.out.print(cell2.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.print(cell2.getBooleanCellValue());
				break;
				 
				default:
					break;
				}
				
				System.out.print(" | | ");
			}
			System.out.println();
		}
	}
	
}
