package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//			Read the Whole values from Xcel sheet by using Nested Forloop

public class ExcelEx4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" | ");
			}
			System.out.println();
		}

	}

}
