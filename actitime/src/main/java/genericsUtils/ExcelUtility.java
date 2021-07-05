package genericsUtils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method will fetch the data from excelsheet
	 * @param filepath
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String filepath,String sheetName,int rownum,int cellnum ) throws Throwable {
		FileInputStream file = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		return cell.getStringCellValue();
	}
}
