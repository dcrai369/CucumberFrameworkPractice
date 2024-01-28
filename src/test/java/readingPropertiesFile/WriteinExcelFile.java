package readingPropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteinExcelFile {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
//File paht
		File location=new File("C:\\Users\\deerai1\\eclipse-workspace\\DataDrivernRelatedProject\\resource\\TestData.xlsx");
		FileInputStream fis =new FileInputStream(location);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		FileOutputStream fos=new FileOutputStream(location);
		wb.write(fos);
		wb.close();
	}

}
