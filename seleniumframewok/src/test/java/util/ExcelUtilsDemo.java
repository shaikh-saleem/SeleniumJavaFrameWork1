package util;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		//String projectPath = System.getProperty("user.dir");
		try {
			ExcelUtil excelobj = new ExcelUtil("E:\\Project\\seleniumframewok\\Excel\\Data.xlsx", "sheet1");
			excelobj.getRowCount();
			excelobj.getCellData(0,0);
			excelobj.getCellDataNumber(1,1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
