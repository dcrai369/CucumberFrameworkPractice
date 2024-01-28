package readingPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\deerai1\\eclipse-workspace\\DataDrivernRelatedProject\\resource\\testData.properties";
		Properties pr=new Properties();

        FileInputStream fs=new FileInputStream(path);
        pr.load(fs);
        
        WebDriver driver = new ChromeDriver();
 	 //  String url = "https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices";
 	    //driver.get(url);
       String x= pr.getProperty("url");
       System.out.println(x);
        driver.get(x);
	}

}
