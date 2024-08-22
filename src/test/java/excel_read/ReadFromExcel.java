package excel_read;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
	
		//load file
		String path = "C:\\Users\\LENOVO\\Desktop\\ExcelR\\Automation Testing\\input_selenium.xlsx";
		FileInputStream fis= new FileInputStream(path);
		//load workbook
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh = wb.getSheet("input");
		XSSFRow row= sh.getRow(0);
		XSSFRow row1 = sh.getRow(1);
		
		String uname = row.getCell(0).getStringCellValue();
		String pwd = row.getCell(1).getStringCellValue();
		System.out.println(uname+"===>"+pwd);
		
		System.out.println("Username: "+row1.getCell(0).getStringCellValue());
		System.out.println("Password: "+row1.getCell(1).getStringCellValue());
		
		
	}

}
