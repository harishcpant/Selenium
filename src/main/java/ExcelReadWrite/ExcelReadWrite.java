package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	public static void main(String[] args) throws IOException {
		System.out.println("Line 1");
		File file = new File("C:\\Harish\\Study\\Java\\EclipseWS\\Selenium\\src\\main\\java\\ExcelReadWrite\\employee.xlsx");   //creating a new file instance  
		
		FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		System.out.println("Line 2");
		XSSFWorkbook wb = new XSSFWorkbook(fis);  
		
		XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		Iterator<Row> itr = sheet.iterator();
		
		while (itr.hasNext()){  
			Row row = itr.next();  
			Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
			while (cellIterator.hasNext()){  
				Cell cell = cellIterator.next();  
				System.out.print(cell.getStringCellValue() + "\t\t\t");  
			}
		}
	}
}
