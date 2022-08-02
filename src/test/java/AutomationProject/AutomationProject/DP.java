package AutomationProject.AutomationProject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class DP {
	
@DataProvider
public static String[][] getData() {
	String[][] testdata=new String[2][4];
	try {
		FileInputStream file=new FileInputStream("./testdata/Book.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		sheet.getRow(0).getLastCellNum();
		  System.out.println("row count"+rowcount)
	} 
	
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
		
	}
	
	catch(Exception f) {
		f.printStackTrace();
		
	}
	
	return null;
	
}
}
