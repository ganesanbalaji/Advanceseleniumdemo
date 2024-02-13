package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadExcelUtility  {
	public static String fetchAllData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook W= WorkbookFactory.create(fis);
	    Sheet s = W.getSheet(sheet);
	    Row r= s.getRow(row);
	    return r.getCell(cell).toString();
	
		
		
	}
	public static int rowsize(String sheet) throws  EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook W= WorkbookFactory.create(fis);
		Sheet s = W.getSheet(sheet);
		return s.getPhysicalNumberOfRows();
		
		
	}
	public static int columnsize(String sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook W= WorkbookFactory.create(fis);
		Sheet s = W.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	public static Object[][]fetchdata(String sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook W= WorkbookFactory.create(fis);
		Sheet s = W.getSheet(sheet);
		int rowsize= s.getPhysicalNumberOfRows();
		int columnsize=s.getRow(0).getPhysicalNumberOfCells();
		Object d[][] = new Object[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
			}
		}
		
		
		
		
		
		

