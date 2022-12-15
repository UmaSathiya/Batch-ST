package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XcelReadDatatypes 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File file = new File("D:\\SELENIUM\\Xcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int totalrows = mysheet.getLastRowNum();
		System.out.println("Total No of Rows:"+totalrows);
		
		int totalcells = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total No Of Cells:"+totalcells);
		
		System.out.println("==========================");
		
		for(int i=0;i<=totalrows;i++)
		{
			for(int j=0;j<=totalcells;j++)
			{
				CellType datatype = mysheet.getRow(i).getCell(j).getCellType();
				
				if(datatype==CellType.BOOLEAN)
				{
					boolean v1 = mysheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(v1+" | ");
				}
				else if(datatype==CellType.STRING)
				{
					String v2 = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(v2+" | ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double v3 = mysheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(v3+" | ");
				}
				else if(datatype==CellType.BLANK)
				{
	//				System.out.println(" | ");
				}
			}
			System.out.println();
		}
	}
}


