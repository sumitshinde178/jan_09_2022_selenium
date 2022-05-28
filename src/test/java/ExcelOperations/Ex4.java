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

public class Ex4 {
	public static void main(String []args) throws IOException {
		System.out.println("program stars*****************");
		//String path = System.getProperties();
		//(STEP=1)
		try{FileInputStream fis = new FileInputStream("./excelFiles/testData.xlsx");
		//(STEP=2)
		Workbook wb = WorkbookFactory.create(fis);
		//(STEP=3)
		Sheet s1 = wb.getSheet("StringType");
		//(Step=4)
		Row r1 = s1.getRow(1);
		//(Step=5)
		Cell c1 = r1.getCell(2);
		Row r =null;
		Cell c=null;
		for(int i= 1 ; i<=s1.getLastRowNum();i++) {
			r=s1.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
			c=r.getCell(j);
			//System.out.println(r.getCell(j));
			System.out.println(c.getStringCellValue());
			
			}
			System.out.println(" ");
		}}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




