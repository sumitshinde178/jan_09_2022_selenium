package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignments1 {
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
				//System.out.println(s1.getRow(i).getCell(j).getCellType());
				//System.out.println("switch case phase");
				CellType ct =s1.getRow(i).getCell(j).getCellType();
				switch(ct) {
				case STRING:System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
				break;
				case FORMULA:System.out.println( s1.getRow(i).getCell(j).getCellFormula());
				break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j)))
					{SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println(sdf.format(s1.getRow(i).getCell(j).getNumericCellValue()));}
					else{System.out.println((long)s1.getRow(i).getCell(j).getNumericCellValue());}

					break;
				case BOOLEAN:System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
				break;
				case BLANK :System.out.println("cell is blank");
				break;
				default :System.out.println("no such cell is available");

				}
			}
			System.out.println(" ");
		}}catch(IOException io) {
			io.printStackTrace();}
		System.out.println("program ends*********");}}




