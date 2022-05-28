package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
	public static void main(String []args) throws IOException {
		System.out.println("program stars*****************");
		//String path = System.getProperties();
		//(STEP=1)
		try{FileInputStream fis = new FileInputStream("./excelFiles/testData.xlsx");
		//(STEP=2)
		Workbook wb = WorkbookFactory.create(fis);
		//(STEP=3)
		Sheet s1 = wb.getSheet("StringType");
		int lastrowno = s1.getLastRowNum();
		System.out.println("lastrowno="+lastrowno);
		int physicalRowno = s1.getPhysicalNumberOfRows();
		System.out.println("physicalRowno="+physicalRowno);
		//(Step=4)
		Row r1 = s1.getRow(1);
		int lastCellNo = r1.getLastCellNum();
		System.out.println("lastCellNo="+lastCellNo);
		int physicalCellNo = r1.getPhysicalNumberOfCells();
		System.out.println("physicalCellNo="+physicalCellNo);
		//(Step=5)
		Cell c1 = r1.getCell(2);
		
		
	
		}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




