package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllValueFromExcelSheet {
	
	public static void main(String[] args, Object sh1) throws IOException, InterruptedException {
		
		String path = "C:\\Users\\ASUS\\Documents\\testsheet.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		
		// to locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh11 = wb.getSheetAt(0);
		
		
		DataFormatter df = new  DataFormatter();
		
		int totalRows = sh11.getLastRowNum()+1;
		
		int actualColumnCount = sh11.getRow(0).getLastCellNum();
	
		for(int i =0; i<totalRows;i++)
	{
		for(int j=0; j<actualColumnCount;j++)
		{
			Thread.sleep(1000);
			
			String Value = df.formatCellValue(sh11.getRow(i).getCell(j));
			
			System.out.println(Value);
		}
			
		}
		
		 
		 
		
		 
	
	 
}
	}
