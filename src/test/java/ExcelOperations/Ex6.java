package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6 {
	public static void main(String []args) throws IOException {
		System.out.println("program stars*****************");
		//String path = System.getProperties();
		//(STEP=1)
		try{FileInputStream fis = new FileInputStream("./excelFiles/testData.xlsx");
		//(STEP=2)
		Workbook wb = WorkbookFactory.create(fis);
		//(STEP=3)
		Sheet s1 = wb.getSheet("AllDataType");
		for(int i= 1 ; i<=s1.getLastRowNum();i++) {
			for(int j=0;j<s1.getRow(i).getLastCellNum();j++) {
				System.out.println(s1.getRow(i).getCell(j).getCellType());
				
				CellType ct =s1.getRow(i).getCell(j).getCellType();
//				switch(ct) {
//				case STRING:System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
//					break;
//				case FORMULA:System.out.println( s1.getRow(i).getCell(j).getCellFormula());
//					break;
//				case NUMERIC:System.out.println((long)s1.getRow(i).getCell(j).getNumericCellValue());
//					break;
//				case BOOLEAN:System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
//					break;
//				case BLANK :System.out.println("cell is blank");
//					break;
//				default :System.out.println("no such cell is available");
//					
				}
			}
			System.out.println(" ");
		}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




