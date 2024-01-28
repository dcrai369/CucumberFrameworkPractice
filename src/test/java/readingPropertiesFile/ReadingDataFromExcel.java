package readingPropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//file path
		File path=new File("C:\\Users\\deerai1\\eclipse-workspace\\DataDrivernRelatedProject\\resource\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(path.toString());
		
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
			int row=sheet1.getLastRowNum();
			System.out.println(row);
for(int i=0;i<row;i++) {
	
	String data=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data);
}
wb.close();
	}

}
