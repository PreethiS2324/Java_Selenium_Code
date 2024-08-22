package excel_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		//load file
		String path = "C:\\Users\\LENOVO\\Desktop\\ExcelR\\Automation Testing\\input_selenium.xlsx";
		FileInputStream fis= new FileInputStream(path);
		//load workbook
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh = wb.getSheet("input");
		int total_rows=sh.getLastRowNum();
		
		for(int r=0;r<=total_rows;r++)
		{
			int total_cell = sh.getRow(r).getLastCellNum();
			System.out.println("Total cell: "+total_cell);
			for(int c=0;c<total_cell;c++)
			{
				System.out.println(sh.getRow(r).getCell(c).getStringCellValue());
			}
		}

	}

}
