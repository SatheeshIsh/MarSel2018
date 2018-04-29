package parameters;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhome {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook("./Data/TC001.xlsx");
		
		XSSFSheet worksheet = workbook.getSheetAt(0);
		
		int rowNum = worksheet.getLastRowNum();		
		System.out.println(rowNum);
		
		XSSFRow headerrow = worksheet.getRow(0);
		int columnnum = headerrow.getLastCellNum();
		System.out.println(columnnum);
		
		for (int j = 1; j <=rowNum; j++) {
			XSSFRow row = worksheet.getRow(j);
			for (int i = 0; i < columnnum; i++) {
				XSSFCell cell = row.getCell(i);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} 
		}
	}

}

