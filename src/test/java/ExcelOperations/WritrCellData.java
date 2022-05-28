package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritrCellData {
	public static void main(String []args) throws IOException {
		System.out.println("program stars*****************");

		try{FileInputStream fis = new FileInputStream("./excelFiles/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("writeCellData");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.createCell(4);
		c1.setCellValue("pass");
		FileOutputStream fos = new FileOutputStream("./excelFiles/testData.xlsx");
		wb.write(fos);
		fos.close()
		;
		
		}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




