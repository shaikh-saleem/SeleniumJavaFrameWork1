package util;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	/*public static void main(String[] args) throws IOException {
		String path="E:\\Project\\seleniumframewok\\Excel\\Data.xlsx";
		testData(path,"sheet1");
	}*/
	@DataProvider(name = "test1data")
  public Object[][] getData() throws IOException
  {
		Object data[][] = testData("E:\\Project\\seleniumframewok\\Excel\\Data.xlsx","sheet1");
		return data;
  }
	
	public static Object[][] testData(String excelPath,String sheetName) throws IOException
	{
					ExcelUtil excelobj = new ExcelUtil(excelPath,sheetName);
			int rowCount =  excelobj.getRowCount();
			int ColumnCount = excelobj.getColumnCount();
			
			Object data[][] = new  Object[rowCount-1][ColumnCount];
			
			for(int i=1;i<rowCount;i++){
				for(int j=0;j<ColumnCount;j++){
					String cellData =excelobj.getCellData(i,j);
					System.out.print(cellData+" | ");
					data[i-1][j]= cellData;
				}
			}
			System.out.println();
		
		
		return data;
		
	}
}
