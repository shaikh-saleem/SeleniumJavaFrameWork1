package util;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtil(String excelPath,String sheetName) throws IOException
	{
		try {
			workbook=new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch (IOException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//getRowCount();
		getCellData(0,0);
		getCellDataNumber(0,1);
	}
	public static int getRowCount()
	{ 
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows:"+rowCount);
		return rowCount;
	}

	public static int getColumnCount()
	{ 
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of Columns:"+columnCount);
		return columnCount;
	}
	public static String getCellData(int rowNum,int colNum)
	{
		String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("Cell data:"+cellData);
		return cellData;

	}

	public static void getCellDataNumber(int rowNum,int colNum)
	{
		double cellData1=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		//System.out.println("Cell data:"+cellData1);

	}

}
