package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class User2{
	
public static void main(String[] args) throws IOException {
	
//	String path = "C:\\Users\\ASUS\\Documents\\testsheet.xlsx";
	
//	File file = new File(path);
	
//	FileInputStream fis = new FileInputStream(file);
	
	
	// to locate the workbook
	
//	XSSFWorkbook wb = new XSSFWorkbook(fis);

//	 XSSFSheet sh1= wb.getSheetAt(0);
	 
//	 String value = sh1.getRow(6).getCell(1).getStringCellValue();

//	 System.out.println(value);
	
	ExcelReader er = new ExcelReader();
	er. readData(3,0);

}

 public String readData(int row, int column)throws IOException
 {
	
	String path = "C:\\Users\\ASUS\\Documents\\testsheet.xlsx";
	
	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	
	
	// to locate the workbook
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);

	 XSSFSheet sh1= wb.getSheetAt(0);
	 
	 String value = sh1.getRow( row).getCell(column).getStringCellValue();

	 System.out.println(value);
	 
	 return  value ;

}
}
