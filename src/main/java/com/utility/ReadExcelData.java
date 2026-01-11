package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ReadExcelData {

	public static String getParticularCellData( int  rowValue, int columnValue){
		String data= null;
		try {		
			File file = new File("C:\\Users\\Hp\\Downloads\\DataDriven_IPT.xlsx");
			
			FileInputStream fileinput = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileinput);
           Sheet sheet =book.getSheet("Sheet1");
			Row row=sheet.getRow(5);
			Cell cell=row.getCell(0);

			DataFormatter dataformat =new DataFormatter();

			data= dataformat.formatCellValue(cell);
			book.close();
			
			
			
		}
		catch (Exception e) {
			System.out.print(e);
		}
		return data;

	}
}




	/*public  static void gatAllData() {
		try
		{
			File file = new File("C:\\Users\\Hp\\Downloads\\DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet=book.getSheet("Sheet1");

			int lastrowno =sheet.getLastRowNum();
			System.out.print("no of row :"+ lastrowno);

			Short lastcellno =sheet.getRow(0).getLastCellNum();
			System.out.print("no of column :"+ lastcellno);


			Row row = sheet.getRow(0);

			for (int i = 0; i < array.length; i++) {
				Cell cell = row.getCell(0);
				DataFormatter dataformat = new DataFormatter();
				String data = dataformat.formatCellValue(cell);
				System.out.println(data);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}*/



