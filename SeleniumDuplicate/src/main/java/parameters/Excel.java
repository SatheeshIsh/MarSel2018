package parameters;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	public Object[][] readExcel() throws IOException {
	
	
	XSSFWorkbook workbook = new XSSFWorkbook ("./Data/TC001.xlsx");
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rowcount = sheet.getLastRowNum();
	System.out.println(rowcount);
	
	XSSFRow headerrow = sheet.getRow(0);
	int columncount = headerrow.getLastCellNum();
	Object[][] data= new Object[rowcount][columncount];
	System.out.println(columncount);
	
	for (int j = 1; j <= rowcount; j++) {
		XSSFRow row = sheet.getRow(j);
		for (int i = 0; i < columncount; i++) {
			XSSFCell cell = row.getCell(i);
			String stringCellValue = cell.getStringCellValue();
			data[j-1][i]=stringCellValue;
			System.out.println(stringCellValue+ " ");
		} 
	 //	System.out.println();
	}
	
	return data;
	}
	
}
