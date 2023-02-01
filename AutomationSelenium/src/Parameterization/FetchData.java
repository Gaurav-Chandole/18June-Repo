package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData 
{
	public static void main(String [] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\NewFile.xlsx");
		double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	}
}
