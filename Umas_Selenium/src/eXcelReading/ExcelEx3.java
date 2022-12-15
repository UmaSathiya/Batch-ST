package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//				Read specific Row value and Specific Column Value

public class ExcelEx3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
//		Read the whole Row from a sheet
		
		for(int i=0;i<=1;i++)
		{
			String value1 = sheet.getRow(2).getCell(i).getStringCellValue();
			System.out.print(value1+" ");
		}
		System.out.println();
		System.out.println("==================================");
//		Read the whole Column from a sheet
		
		for(int j=0;j<=1;j++)
		{
			String value2 = sheet.getRow(j).getCell(2).getStringCellValue();
			System.out.println(value2+" ");
		}

	}

}
