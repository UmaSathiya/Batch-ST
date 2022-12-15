package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Read different datatype values from xcel sheet with total no of rows & cells

public class ExcelEx6 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int totalnoRows = sheet.getLastRowNum();
		
		int totalnocells = sheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalnoRows;i++)
		{
			for(int j=0;j<=totalnocells;j++)
			{
				CellType datatype = sheet.getRow(i).getCell(j).getCellType();
				
				if(datatype==CellType.STRING)
				{
					String value1 = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value1+" | ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value2 = sheet.getRow(i).getCell(j).getBooleanCellValue();	
					System.out.print(value2+" | ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value3 = sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value3+" | ");					
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
