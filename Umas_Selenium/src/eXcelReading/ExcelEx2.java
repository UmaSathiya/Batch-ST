package eXcelReading;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		String value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		double value2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value2);
		
		boolean value3 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(value3);
		
		Date value4 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getDateCellValue();
		System.out.println(value4);
		
	}

}
