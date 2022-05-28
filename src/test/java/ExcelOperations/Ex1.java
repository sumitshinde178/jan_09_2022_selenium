package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
	public static void main(String []args) throws IOException {
		System.out.println("program stars*****************");
		//String path = System.getProperties();
		try{FileInputStream fis = new FileInputStream("./excelFiles/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int totalSheet = wb.getNumberOfSheets();
		System.out.println("totalSheet="+totalSheet );
		String allSheetNames = wb.getSheetName(1);
		//wb.getSheetIndex(null);
		for (int i=0;i<totalSheet;i++) {
			System.out.println("allSheetNames"+ (i)+"="+ wb.getSheetName(i));
		}}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




