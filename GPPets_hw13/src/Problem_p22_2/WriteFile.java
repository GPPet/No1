package Problem_p22_2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {
	public String path;
	
	public void writeString2File(String path, String input) throws Exception{
		FileWriter fileWriter = new FileWriter(path);
		
		BufferedWriter stringWriter = new BufferedWriter(fileWriter);
		
		stringWriter.write(input);
		
		stringWriter.close();
	}
}
