package com.Assessment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssessmentExcel extends AssessmentConstant {
	
	public static String dataEx(String sheet,int rownum,int columnNum) throws IOException {
		
		
		File f = new File("https://d.docs.live.net/c2987e2cf7ca7c66/Documents/Assessment.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		CellType ct = c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			
			String s1 = c.getStringCellValue();
			return s1;
		
		} else {
			
			double d = c.getNumericCellValue();
			int e =(int)d;
			String s1 = String.valueOf(e);
			return s1;
					

		}
		

	}
}
