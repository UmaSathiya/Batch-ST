package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastrowNo = sheet.getLastRowNum();
		System.out.println(lastrowNo);
		
		int totalrowNo = lastrowNo;
		System.out.println("Total no.of Rows:"+totalrowNo);
		
		short lastcellNo = sheet.getRow(0).getLastCellNum();
		System.out.println(lastcellNo);
		
		int totalcellNo = lastcellNo-1;
		System.out.println("Total no.of cells:"+totalcellNo);
		
		for(int i=0;i<=totalrowNo;i++)
		{
			for(int j=0;j<=totalcellNo;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" | ");
			}
			System.out.println();
		}

	}

}
