package readingPropertiesFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreateFileandWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter(new File("First.properties"));
		writer.write("this is first line \n this is second line \n this is third file");
		writer.close();
System.out.println("file created");

Path path = Paths.get("First.properties");

// Read all lines from the file
List<String> lines = Files.readAllLines(path);

for(String x:lines) {
	
	System.out.println(x);
	

	}

	}}
