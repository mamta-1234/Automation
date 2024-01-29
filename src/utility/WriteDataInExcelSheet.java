package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelSheet {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		String path = "C:\\Users\\ASUS\\Documents\\testsheet.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
	// to locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
	
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(5).getCell(1).setCellValue("Write data in excel");// to write the data inside the excel sheet
		
		sh1.getRow(7).createCell(6).setCellValue("6th cell  value in 7th row");
		
		sh1.createRow(46).createCell(0).setCellValue("Creating row and cell");
		
		wb.write(fos);// to save the data that we have written inside the excel sheet
	}
}
