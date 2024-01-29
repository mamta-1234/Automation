package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWithAnyTypeOfData {

	
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\ASUS\\Documents\\testsheet.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		
		// to locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		 XSSFSheet sh1= wb.getSheetAt(0);
		 
// To handle ANY TYPE OF DATA WE NEED TO  CREATE TH OBJECT OF DATAFORMTTER
		 
		DataFormatter df = new  DataFormatter();
		
		String data = df.formatCellValue(sh1.getRow(44).getCell(1));
		
		System.out.println(data);
		 
		 for(int i =0;i<45;i++)
		 {
			String Value = df.formatCellValue(sh1.getRow(i).getCell(1));
			 
			
			 
			System.out.println(Value);
		 
		 }
		 
// to get the maximum number of rows available inside the excel sheet
		 
	int totalNumberOfRows= sh1.getLastRowNum();
	
	System.out.println("Total number of rows"+totalNumberOfRows);
		 
	
	int actualRowCount= totalNumberOfRows +1;
		 
	System.out.println("Actual number of rows are"+totalNumberOfRows+1);
	
	int columnCount =sh1.getRow(0).getLastCellNum();
	
	System.out.println(columnCount);
	}
}
