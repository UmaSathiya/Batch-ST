package eXcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//					Child Way of coding
public class ExcelEx1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("D:\\SELENIUM\\Xcel.xlsx");
		
		 Workbook myWbook = WorkbookFactory.create(myFile);
		 
		  Sheet mysheet = myWbook.getSheet("Sheet1");
		  
		  Row myRow = mysheet.getRow(0);
		  
		  Cell myCell = myRow.getCell(0);
		  
		  CellType myType = myCell.getCellType();
		  
		  System.out.println(myType);
		  
		  String myValue = myCell.getStringCellValue();
		  
		  System.out.println(myValue);
	}
}
